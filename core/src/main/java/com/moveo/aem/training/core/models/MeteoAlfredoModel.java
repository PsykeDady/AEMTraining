package com.moveo.aem.training.core.models;


import com.moveo.aem.training.core.services.WeatherAlfredoService;
import com.moveo.aem.training.core.services.beans.DailyWeatherAlfredoBean;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.util.List;

@Model(adaptables = Resource.class)
public class MeteoAlfredoModel {

    @ValueMapValue
    private String latitudine;

    @ValueMapValue
    private String longitudine;

    //private String[] giorniSettimana;

    //richiamiamo la nostra interfaccia
    @OSGiService
    private WeatherAlfredoService weatherAlfredoService;

    private List<DailyWeatherAlfredoBean> dailyWeatherAlfredoBeanList;

    private static Logger logger = LoggerFactory.getLogger(MeteoAlfredoModel.class);
    @PostConstruct
    protected void init() {

        try {
            // inserisco nella lista che utilizzo a FE
            dailyWeatherAlfredoBeanList = weatherAlfredoService.getDailyForecast(latitudine, longitudine);
            logger.debug("la classe ha funzionato correttamente!!");
        } catch(Exception e){
            e.printStackTrace();
            logger.error("Errore durante la chiamata di "+ MeteoAlfredoModel.class.getName() + "  errore:  "+ e.getMessage());
        }

    }

    public List<DailyWeatherAlfredoBean> getDailyWeatherAlfredoBeanList () {
        return dailyWeatherAlfredoBeanList;
    }


}
