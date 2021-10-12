package com.moveo.aem.training.core.models.bitcoin.francesco2;


import com.moveo.aem.training.core.beans.bitcoin.francesco2.BitcoinBean;
import com.moveo.aem.training.core.services.bitcoin.francesco2.BitcoinService;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.util.List;

@Model(adaptables = Resource.class)
public class BitcoinFrancesco {

    @OSGiService
    private BitcoinService bitcoinService;

    private List<BitcoinBean> bitcoinBeanList;

    private static Logger logger = LoggerFactory.getLogger(BitcoinFrancesco.class);

    @PostConstruct
    protected  void init(){
        try{
            bitcoinBeanList=bitcoinService.getCrypto();
            logger.debug("classe Bitcoin Francesco funziona");
        }catch (Exception e){
            logger.error("errore durante la chiamata di BitcoinFrancesco" + e.getMessage());
        }
    }

    public List<BitcoinBean> getBitcoinBean(){return  bitcoinBeanList;}

}
