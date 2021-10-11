package com.moveo.aem.training.core.models.bitcoin.francesco;


import com.moveo.aem.training.core.beans.bitcoin.francesco.BitcoinBean;
import com.moveo.aem.training.core.services.bitcoin.francesco.BitcoinService;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.sling.api.resource.Resource;

import javax.annotation.PostConstruct;

@Model(adaptables = Resource.class)
public class BitcoinFrancesco {

    @OSGiService
    private BitcoinService bitcoinService;

    private BitcoinBean bitcoinBean;

    private static Logger logger = LoggerFactory.getLogger(BitcoinFrancesco.class);

    @PostConstruct
    protected  void init(){
        try{
            bitcoinBean=bitcoinService.getBitcoin();
            logger.debug("classe Bitcoin Francesco funziona");
        }catch (Exception e){
            logger.error("errore durante la chiamata di BitcoinFrancesco" + e.getMessage());
        }
    }

    public BitcoinBean getBitcoinBean(){return  bitcoinBean;}

}
