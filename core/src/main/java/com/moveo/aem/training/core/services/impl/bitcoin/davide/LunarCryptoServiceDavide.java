package com.moveo.aem.training.core.services.impl.bitcoin.davide;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.moveo.aem.training.core.beans.bitcoin.davide.Cryptos;
import com.moveo.aem.training.core.beans.bitcoin.davide.Datum;
import com.moveo.aem.training.core.beans.bitcoin.davide.Root;
import com.moveo.aem.training.core.services.CryptoServiceDavide;
import com.moveo.aem.training.core.utils.NetUtils;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.moveo.aem.training.core.services.impl.bitcoin.davide.LunarCryptoConsts.URL;


@Designate(ocd = LunarCryptoApiKey.class)
@Component(service = {CryptoServiceDavide.class})
/**
 * Implementazione Crypto Service che utilizza le API di LunarCrush https://lunarcrush.com/
 * @author Davide Galati (davide.galati@moveo.it) Alias PsykeDady (psdady@msn.com)
 */
public class LunarCryptoServiceDavide implements CryptoServiceDavide {

	private String appID;
	private Logger logger = LoggerFactory.getLogger(LunarCryptoServiceDavide.class);

	@Activate
	protected void activate(final LunarCryptoApiKey config){
		appID=config.apiID();
	}

	@Override
	public List<Datum> getCryptos(Cryptos... names) {
		StringBuilder urlB=new StringBuilder(URL);
		for (Cryptos c : names) {
			urlB.append(c.name()).append(',');
		}
		urlB.deleteCharAt(urlB.length()-1);
		String url=String.format(urlB.toString(),appID);
		logger.info(String.format("%n%nURL=%s%n%n", url));
		logger.debug(String.format("%n%nURL=%s%n%n", url));
		System.out.println(String.format("%n%nURL=%s%n%n", url));
		String response ="{}";
		try {response=NetUtils.executeGet(url);}
		catch(Exception e){logger.error(e.getMessage()); return null;}
		ObjectMapper om= new ObjectMapper();

		Root r= null;
		
		try {r=om.readValue(response,Root.class);}
		catch(Exception e){logger.error(e.getMessage()); return null;}


		return r.getData();
	}

	
}
