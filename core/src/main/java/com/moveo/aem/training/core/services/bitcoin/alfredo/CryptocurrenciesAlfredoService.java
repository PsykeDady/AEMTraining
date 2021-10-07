package com.moveo.aem.training.core.services.bitcoin.alfredo;

import com.moveo.aem.training.core.beans.bitcoin.alfredo.CryptocurrenciesAlfredoBean;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface CryptocurrenciesAlfredoService {

    public List<CryptocurrenciesAlfredoBean> getListCryptocurrencies (String max) throws IOException, ParseException;
}
