package com.moveo.aem.training.core.models;

import java.util.List;

import javax.annotation.PostConstruct;

import com.moveo.aem.training.core.beans.bitcoin.davide.Cryptos;
import com.moveo.aem.training.core.beans.bitcoin.davide.Datum;
import com.moveo.aem.training.core.services.CryptoServiceDavide;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

@Model(adaptables= Resource.class)
public class CryptoDavideModel {

	@OSGiService
	private CryptoServiceDavide cryptoService;

	private List<Datum> dati; 

	@PostConstruct
	protected void init(){
		Cryptos [] cryptos = Cryptos.values();
		dati=cryptoService.getCryptos(cryptos);
	}

	public List<Datum> getDati() {
		return dati;
	}
	
}
