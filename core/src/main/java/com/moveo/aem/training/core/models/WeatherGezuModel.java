package com.moveo.aem.training.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Model(adaptables = Resource.class)
public class WeatherGezuModel {

    @ValueMapValue
    private String latitude;

    @ValueMapValue
    private String longtitude;

    private String location;


    @PostConstruct
    protected void init() {

        latitude = latitude == null ? "" : latitude;
        longtitude = longtitude == null ? "" : longtitude;

    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongtitude() {
        return longtitude;
    }

}
