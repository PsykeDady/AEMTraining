package com.moveo.aem.training.core.services.impl.bitcoin.davide;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Designate(ocd = LunarCryptoApiKey.class)
@ObjectClassDefinition(name="API Key", description="Lunar Crypt API key from davide account" ) 
public @interface LunarCryptoApiKey {
	@AttributeDefinition (name="API Key", description="Lunar Crypt API key from davide account" ) 
	String apiID() default "2l0x9fedu3ksscxzv5qxq";
}
