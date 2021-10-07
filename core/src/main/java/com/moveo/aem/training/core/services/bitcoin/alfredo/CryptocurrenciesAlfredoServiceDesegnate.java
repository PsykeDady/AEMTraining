package com.moveo.aem.training.core.services.bitcoin.alfredo;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Designate(ocd= com.moveo.aem.training.core.services.bitcoin.alfredo.CryptocurrenciesAlfredoServiceDesegnate.class)

@ObjectClassDefinition(name="Cryptocurrencies Alfredo configuration",
        description = "Cryptocurrencies Alfredo")

public @interface CryptocurrenciesAlfredoServiceDesegnate {

    @AttributeDefinition(name = "API key",
            description = "coinmarketcap api key")
    String apiKey() default "f9cd85cf-5592-417d-9cb1-cc4c39ca1a49";



}