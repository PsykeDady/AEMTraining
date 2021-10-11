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

import static com.moveo.aem.training.core.services.impl.bitcoin.davide.LunarCryptoConsts.URL;


@Designate(ocd = LunarCryptoApiKey.class)
@Component(service = {CryptoServiceDavide.class})
/**
 * Implementazione Crypto Service che utilizza le API di LunarCrush https://lunarcrush.com/
 * @author Davide Galati (davide.galati@moveo.it) Alias PsykeDady (psdady@msn.com)
 */
public class LunarCryptoServiceDavide implements CryptoServiceDavide {

	private String appID;

	@Activate
	protected void activate(final LunarCryptoApiKey config){
		appID=config.apiID();
	}

	@Override
	public Root getCryptos(Cryptos... names) {
		StringBuilder urlB=new StringBuilder(URL);
		for (Cryptos c : names) {
			urlB.append(c.name()).append(',');
		}
		urlB.deleteCharAt(urlB.length());
		String url=String.format(urlB.toString(),appID);
		
		String response ="{}";
		try {response=NetUtils.executeGet(url);}
		catch(Exception e){ return null;}
		ObjectMapper om= new ObjectMapper();

		Root r= null;
		
		try {r=om.readValue(response,Root.class);}
		catch(Exception e){return null;}


		return r;
	}

	
}
