package com.moveo.aem.training.core.services.bitcoin.francesco2;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Designate(ocd = BitcoinServiceDesegnate.class)

@ObjectClassDefinition(name = "Aemtraining Bitcoin configuration", description = "Aemtraining Bitcoin configuration")

public @interface BitcoinServiceDesegnate {

    @AttributeDefinition(name = "API key", description =  "CoinMarketCap api Key")
    String apiId() default "72890744-ae41-4ef8-acbb-68b6f79e74de";
}
