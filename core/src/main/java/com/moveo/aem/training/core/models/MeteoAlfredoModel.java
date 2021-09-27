package com.moveo.aem.training.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Model(adaptables = Resource.class)
public class MeteoAlfredoModel {

    @ValueMapValue
    private String latitudine;

    @ValueMapValue
    private String longitudine;


    @PostConstruct
    protected void init() {

    }

    public String getLatitudine(){
        return latitudine;
    }
    public String getLongitudine(){
        return longitudine;
    }

}
