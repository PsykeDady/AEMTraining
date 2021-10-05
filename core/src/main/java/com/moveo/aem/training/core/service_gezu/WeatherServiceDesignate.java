package com.moveo.aem.training.core.service_gezu;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Designate(ocd=WeatherServiceDesignate.class)
@ObjectClassDefinition(name = "Aemtraining weather configuration", description = "Aemtraining weather")
public @interface WeatherServiceDesignate {

    @AttributeDefinition(name = "API key", description = "openweather api key")

    String apiId() default "035bc90dff2b72d52dff0435f94719e3";
}
