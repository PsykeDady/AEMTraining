package com.moveo.aem.training.core.models.bitcoin.alfredo;


import com.moveo.aem.training.core.beans.bitcoin.alfredo.CryptocurrenciesAlfredoBean;
import com.moveo.aem.training.core.services.bitcoin.alfredo.CryptocurrenciesAlfredoService;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.util.List;

@Model(adaptables = Resource.class)
public class CryptocurrenciesAlfredoModel {

    @ValueMapValue
    private String maxCrypto;

    //richiamiamo la nostra interfaccia
    @OSGiService
    private CryptocurrenciesAlfredoService cryptocurrenciesAlfredoService;

    private List<CryptocurrenciesAlfredoBean> cryptocurrenciesAlfredoBeanList;

    private static Logger logger = LoggerFactory.getLogger(CryptocurrenciesAlfredoModel.class);
    @PostConstruct
    protected void init() {

        try {
            // inserisco nella lista che utilizzo a FE
            cryptocurrenciesAlfredoBeanList = cryptocurrenciesAlfredoService.getListCryptocurrencies(maxCrypto);
            logger.debug("la classe ha funzionato correttamente!!");
        } catch(Exception e){
            e.printStackTrace();
            logger.error("Errore durante la chiamata di "+ CryptocurrenciesAlfredoModel.class.getName() + "  errore:  "+ e.getMessage());
        }

    }

    public List<CryptocurrenciesAlfredoBean> getCryptocurrenciesAlfredoBeanList () {
        return cryptocurrenciesAlfredoBeanList;
    }


}
