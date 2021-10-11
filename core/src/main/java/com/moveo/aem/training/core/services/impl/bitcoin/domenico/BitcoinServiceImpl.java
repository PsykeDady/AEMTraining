package com.moveo.aem.training.core.services.impl.bitcoin.domenico;


import com.fasterxml.jackson.databind.ObjectMapper;

import com.moveo.aem.training.core.beans.bitcoin.domenico.BitcoinBean;

import com.moveo.aem.training.core.beans.response.bitcoin.domenico.BitcoinResponse;
import com.moveo.aem.training.core.services.domenico.BitcoinService;
import com.moveo.aem.training.core.services.domenico.BitcoinServiceDesegnate;
import com.moveo.aem.training.core.utils.HttpClientFrancesco;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


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
    public BitcoinBean getBitcoin() throws  Exception{
        logger.debug("entrato in BitcoinServiceImp");
        String url = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/quotes/latest?symbol=BTC&convert=EUR&CMC_PRO_API_KEY="+appKey;
        logger.info("URLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL" + url);
        String response = HttpClientFrancesco.executeGet(url);
        ObjectMapper objectMapper = new ObjectMapper();
        BitcoinResponse bitcoinResponse = objectMapper.readValue(response, BitcoinResponse.class);


        BitcoinBean bitcoinBean = new BitcoinBean();
        bitcoinBean.setSymbol(bitcoinResponse.getData().getBtc().getSymbol());
        bitcoinBean.setMax_supply(bitcoinResponse.getData().getBtc().getMaxSupply());
        bitcoinBean.setPrice(bitcoinResponse.getData().getBtc().getQuote().getEur().getPrice());
        bitcoinBean.setPercent_change_7d(bitcoinResponse.getData().getBtc().getQuote().getEur().getPercentChange7d());
        bitcoinBean.setPercent_change_24h(bitcoinResponse.getData().getBtc().getQuote().getEur().getPercentChange24h());

        logger.info("DATIiiiiiiiiiiiiiiiiiiiii       " + bitcoinBean);
        return bitcoinBean;
    }

}
