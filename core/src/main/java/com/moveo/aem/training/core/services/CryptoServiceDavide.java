package com.moveo.aem.training.core.services;

import java.util.List;

import com.moveo.aem.training.core.beans.bitcoin.davide.Cryptos;
import com.moveo.aem.training.core.beans.bitcoin.davide.Datum;

public interface CryptoServiceDavide {
	public List<Datum> getCryptos(Cryptos ... names);
}
