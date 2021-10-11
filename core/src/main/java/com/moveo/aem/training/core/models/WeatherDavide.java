package com.moveo.aem.training.core.models;


import com.moveo.aem.training.core.services.WeatherService;
import com.moveo.aem.training.core.beans.DailyWeatherBean;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.util.List;

@Model(adaptables = Resource.class)
public class WeatherDavide {

    @ValueMapValue
    private  static String longitudine;

    @ValueMapValue
    private static String latitudine;

    @OSGiService
    private WeatherService weatherService;

    private List<DailyWeatherBean> dailyWeatherBeanList;



    private static Logger logger = LoggerFactory.getLogger(WeatherDavide.class);

    @PostConstruct
    protected void init() {


        try {
            dailyWeatherBeanList=weatherService.getDailyForecast(latitudine,longitudine);
        } catch (Exception e) {
        }

    }

    public List<DailyWeatherBean> getDailyWeatherBeanList () {
        return dailyWeatherBeanList;
    }


}
