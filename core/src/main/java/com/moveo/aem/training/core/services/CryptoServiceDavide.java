package com.moveo.aem.training.core.services;

import com.moveo.aem.training.core.beans.bitcoin.davide.Cryptos;
import com.moveo.aem.training.core.beans.bitcoin.davide.Root;

public interface CryptoServiceDavide {
	public Root getCryptos(Cryptos ... names);
}
