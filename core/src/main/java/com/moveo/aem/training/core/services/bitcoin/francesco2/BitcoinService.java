package com.moveo.aem.training.core.services.bitcoin.francesco2;

import com.moveo.aem.training.core.beans.bitcoin.francesco2.BitcoinBean;

import java.util.List;

public interface BitcoinService {

    public List<BitcoinBean> getCrypto() throws Exception;
}
