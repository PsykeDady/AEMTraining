package com.moveo.aem.training.core.services;


import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Designate(ocd= WeatherServiceDesegnate.class)

@ObjectClassDefinition(name="Aemtraning weather configuration",
        description = "Aemtraning weather")


public @interface WeatherServiceDesegnate {

    @AttributeDefinition(name = "API key",
            description = "openweather api key")
    String apiId() default "777a8a95a8fe7b0637a7daf3a860d216";

}
