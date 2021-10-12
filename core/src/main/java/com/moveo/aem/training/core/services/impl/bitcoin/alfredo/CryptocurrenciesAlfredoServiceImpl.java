package com.moveo.aem.training.core.services.impl.bitcoin.alfredo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.moveo.aem.training.core.beans.bitcoin.alfredo.CryptocurrenciesAlfredoBean;
import com.moveo.aem.training.core.beans.response.bitcoin.alfredo.CryptocurrenciesResponse;
import com.moveo.aem.training.core.beans.response.bitcoin.alfredo.Datum;
import com.moveo.aem.training.core.services.bitcoin.alfredo.CryptocurrenciesAlfredoService;
import com.moveo.aem.training.core.services.bitcoin.alfredo.CryptocurrenciesAlfredoServiceDesegnate;
import com.moveo.aem.training.core.utils.HttpClientAlfredo;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Designate(ocd = CryptocurrenciesAlfredoServiceDesegnate.class)
@Component(service = {CryptocurrenciesAlfredoService.class})
public class CryptocurrenciesAlfredoServiceImpl implements CryptocurrenciesAlfredoService {


    private String chiave;

    @Activate
    protected void activate(final CryptocurrenciesAlfredoServiceDesegnate config) {
        chiave = config.apiKey();
    }

    @Override
    public List<CryptocurrenciesAlfredoBean> getListCryptocurrencies(String max) throws IOException, ParseException {

        String url = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest?start=1&limit=" + max;

        String responce = HttpClientAlfredo.getJsonCryptocurrencies(url,chiave);

        // mappiamo ora la risposta json in java
        ObjectMapper mapper = new ObjectMapper();
        CryptocurrenciesResponse cryptocurrenciesResponse = mapper.readValue(responce, CryptocurrenciesResponse.class);

        List<CryptocurrenciesAlfredoBean> cryptocurrenciesAlfredoBeanList = new ArrayList<CryptocurrenciesAlfredoBean>();
        for(Datum resp: cryptocurrenciesResponse.getData()){

            CryptocurrenciesAlfredoBean cryptocurrenciesAlfredoBean = new CryptocurrenciesAlfredoBean();


            //set id
            cryptocurrenciesAlfredoBean.setId(String.valueOf(resp.getId()));

            //set nome
            cryptocurrenciesAlfredoBean.setNome(resp.getName());

            //set logo
            cryptocurrenciesAlfredoBean.setLogo("https://s2.coinmarketcap.com/static/img/coins/64x64/"+ cryptocurrenciesAlfredoBean.getId() +".png");

            //set sigla
            cryptocurrenciesAlfredoBean.setSigla(resp.getSymbol());

            //set prezzo
            cryptocurrenciesAlfredoBean.setPrezzoUsd(String.valueOf(resp.getQuote().getUsd().getPrice()));

            //set data ultimo aggiornamento
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.000'Z'");
            Date dataTmp = format.parse(resp.getLastUpdated());
            //String timezone = String.valueOf(resp.getLastUpdated()).split("\\.")[1];
            // creazione data custom
            SimpleDateFormat risposta = new SimpleDateFormat("dd-MM-yyyy");
            String output=risposta.format(dataTmp);

            cryptocurrenciesAlfredoBean.setDataUltimoAggiornamento(output);

            cryptocurrenciesAlfredoBeanList.add(cryptocurrenciesAlfredoBean);

        }

        return cryptocurrenciesAlfredoBeanList;
    }
}
