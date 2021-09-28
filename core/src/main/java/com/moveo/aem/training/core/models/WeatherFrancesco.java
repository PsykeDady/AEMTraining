package com.moveo.aem.training.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;

@Model(adaptables = Resource.class)
public class WeatherFrancesco {

    @ValueMapValue
    private String longitudine;

    @ValueMapValue
    private String latitudine;

    @PostConstruct
    protected void init() {

        latitudine=latitudine==null?"":latitudine;
        longitudine=longitudine==null?"":longitudine;

    }

    public String getLatitudine() {
        return latitudine;
    }

    public String getLongitudine() {
        return longitudine;
    }
}
