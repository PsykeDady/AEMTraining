package com.moveo.aem.training.core.models;


import com.moveo.aem.training.core.services.WeatherService;
import com.moveo.aem.training.core.services.beans.DailyWeatherBean;
import com.moveo.aem.training.core.services.impl.WeatherServiceImpl;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.util.List;

@Model(adaptables = Resource.class)
public class WheaterDomModel {

    @ValueMapValue
    private  static String longitudine="29.00";

    @ValueMapValue
    private static String latitudine="30.00";

    @OSGiService
    private WeatherService weatherService;

    private List<DailyWeatherBean> dailyWeatherBeanList;

    private static Logger logger = LoggerFactory.getLogger(WheaterDomModel.class);

    @PostConstruct
    protected void init() {


        try {
            dailyWeatherBeanList=weatherService.getDailyForecast(latitudine,longitudine);
            logger.debug("classe WeatherFrancesco funziona");
        } catch (Exception e) {
            logger.error("errore durante la chiamata di WheaterDomModel"+e.getMessage());
        }

    }

    public List<DailyWeatherBean> getDailyWeatherBeanList () {
        return dailyWeatherBeanList;
    }

    public DailyWeatherBean getDayOne () {
        return dailyWeatherBeanList.get(0);
    }


}
