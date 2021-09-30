package com.moveo.aem.training.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Designate(ocd= WeatherAlfredoServiceDesegnate.class)

@ObjectClassDefinition(name="Aemtraning weather Alfredo configuration",
        description = "Aemtraning weather Alfredo")

public @interface WeatherAlfredoServiceDesegnate {

    @AttributeDefinition(name = "API key",
            description = "openweather api key")
    String apiId() default "fd4a3d5871e3824ca6748d29aa1b25d8";



}
