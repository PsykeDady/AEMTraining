package com.moveo.aem.training.core.models.bitcoin.domenico;

import com.moveo.aem.training.core.beans.bitcoin.domenico.BitcoinBean;
import com.moveo.aem.training.core.services.domenico.BitcoinService;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.sling.api.resource.Resource;

import javax.annotation.PostConstruct;

@Model(adaptables = Resource.class)
public class BitcoinDom {

    @OSGiService
    private BitcoinService bitcoinService;

    private BitcoinBean bitcoinBean;

    private static Logger logger = LoggerFactory.getLogger(com.moveo.aem.training.core.models.bitcoin.domenico.BitcoinDom.class);

    @PostConstruct
    protected  void init(){
        try{
            bitcoinBean=bitcoinService.getBitcoin();
            logger.debug("classe Bitcoin Dom funziona");
        }catch (Exception e){
            logger.error("errore durante la chiamata di BitcoinFrancesco" + e.getMessage());
        }
    }

    public BitcoinBean getBitcoinBean(){return  bitcoinBean;}

}
