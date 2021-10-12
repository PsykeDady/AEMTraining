package com.moveo.aem.training.core.services.impl.bitcoin.francesco2;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.moveo.aem.training.core.beans.bitcoin.francesco2.BitcoinBean;
import com.moveo.aem.training.core.beans.response.bitcoin.francesco2.CryptoResponse;
import com.moveo.aem.training.core.services.bitcoin.francesco2.BitcoinService;
import com.moveo.aem.training.core.services.bitcoin.francesco2.BitcoinServiceDesegnate;
import com.moveo.aem.training.core.utils.HttpClientFrancesco;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;


@Designate(ocd = BitcoinServiceDesegnate.class)
@Component(service = {BitcoinService.class})
public class BitcoinServiceImpl implements  BitcoinService{

    private String appKey;

    private static Logger logger = LoggerFactory.getLogger(BitcoinServiceImpl.class);

    @Activate
    protected  void activate(final BitcoinServiceDesegnate config){
        appKey = config.apiId();
    }

    @Override
    public List<BitcoinBean> getCrypto() throws  Exception{
        logger.debug("entrato in BitcoinServiceImp");
        String url = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/quotes/latest?symbol=BTC,ETH,BNB&convert=EUR&CMC_PRO_API_KEY="+appKey;
        logger.info("URLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL" + url);
        String response = HttpClientFrancesco.executeGet(url);
        ObjectMapper objectMapper = new ObjectMapper();
        CryptoResponse bitcoinResponse = objectMapper.readValue(response, CryptoResponse.class);

        List<BitcoinBean> lalistadaritornare=new ArrayList<>(3);

        BitcoinBean bitcoinBean = new BitcoinBean();
        bitcoinBean.setSymbol(bitcoinResponse.getData().getBtc().getSymbol());
        bitcoinBean.setMax_supply(bitcoinResponse.getData().getBtc().getMaxSupply());
        bitcoinBean.setPrice(bitcoinResponse.getData().getBtc().getQuote().getEur().getPrice());
        bitcoinBean.setPercent_change_7d(bitcoinResponse.getData().getBtc().getQuote().getEur().getPercentChange7d());
        bitcoinBean.setPercent_change_24h(bitcoinResponse.getData().getBtc().getQuote().getEur().getPercentChange24h());
        lalistadaritornare.add(bitcoinBean);
        bitcoinBean=new BitcoinBean();

        bitcoinBean.setSymbol(bitcoinResponse.getData().getEth().getSymbol());
        bitcoinBean.setPrice(bitcoinResponse.getData().getEth().getQuote().getEur().getPrice());
        bitcoinBean.setPercent_change_7d(bitcoinResponse.getData().getEth().getQuote().getEur().getPercentChange7d());
        bitcoinBean.setPercent_change_24h(bitcoinResponse.getData().getEth().getQuote().getEur().getPercentChange24h());
        lalistadaritornare.add(bitcoinBean);
        bitcoinBean=new BitcoinBean();

        bitcoinBean.setSymbol(bitcoinResponse.getData().getBnb().getSymbol());
        bitcoinBean.setMax_supply(bitcoinResponse.getData().getBnb().getMaxSupply());
        bitcoinBean.setPrice(bitcoinResponse.getData().getBnb().getQuote().getEur().getPrice());
        bitcoinBean.setPercent_change_7d(bitcoinResponse.getData().getBnb().getQuote().getEur().getPercentChange7d());
        bitcoinBean.setPercent_change_24h(bitcoinResponse.getData().getBnb().getQuote().getEur().getPercentChange24h());
        lalistadaritornare.add(bitcoinBean);


        logger.info("DATIiiiiiiiiiiiiiiiiiiiii       " + bitcoinBean);
        return lalistadaritornare;
    }

}
