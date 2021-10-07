package com.moveo.aem.training.core.services.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.moveo.aem.training.core.services.WeatherServiceDesegnate;
import com.moveo.aem.training.core.beans.DailyWeatherBean;
import com.moveo.aem.training.core.services.WeatherService;
import com.moveo.aem.training.core.beans.response.weather.Daily;
import com.moveo.aem.training.core.beans.response.weather.DailyWeatherResponse;
import com.moveo.aem.training.core.utils.HttpClientFrancesco;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

@Designate(ocd = WeatherServiceDesegnate.class)
@Component(service = {WeatherService.class})
public class WeatherServiceImpl implements WeatherService {

    private String appKey;

    private static Logger logger = LoggerFactory.getLogger(WeatherServiceImpl.class);

    @Activate
    protected void activate(final WeatherServiceDesegnate config) {
        appKey = config.apiId();
    }


    @Override
    public List<DailyWeatherBean> getDailyForecast(String latitudine, String longitudine) throws Exception {
        logger.debug("entrato in WeatherServiceImpl");

           String url = "https://api.openweathermap.org/data/2.5/onecall?lat="+latitudine+"&lon="+longitudine+"&lang=it&exclude=minutely,current,hourly,alerts&units=metric&appid="+appKey;

        logger.info("URLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL" + url);

        String response = HttpClientFrancesco.executeGet(url);
        //TODO controllo sulla response
        ObjectMapper objectMapper = new ObjectMapper();
        DailyWeatherResponse dailyWeatherResponse = objectMapper.readValue(response, DailyWeatherResponse.class);
        List<DailyWeatherBean> dailyWeatherBeanList = new ArrayList<DailyWeatherBean>();

        for (Daily dailyWeatherResp : dailyWeatherResponse.getDaily()){
            // TODO: convertire epoch to Date
            DailyWeatherBean dailyWeatherBean = new DailyWeatherBean();
            LocalDateTime localdatetime=LocalDateTime.ofEpochSecond(dailyWeatherResp.getDt(),0, ZoneOffset.UTC);
            dailyWeatherBean.setDay(italianWeek(localdatetime.getDayOfWeek()));
            dailyWeatherBean.setTempMax(dailyWeatherResp.getTemp().getMax().toString());
            logger.info("MAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" + dailyWeatherResp.getTemp().getMax().toString() );
            dailyWeatherBean.setTempMin(dailyWeatherResp.getTemp().getMin().toString());
            dailyWeatherBean.setIcon(dailyWeatherResp.getWeather().get(0).getIcon());
            dailyWeatherBean.setDescription(dailyWeatherResp.getWeather().get(0).getDescription());
            dailyWeatherBeanList.add(dailyWeatherBean);
        }


        return  dailyWeatherBeanList;
    }

    private static String italianWeek(DayOfWeek day){
        switch (day){
            case MONDAY: return "Luned\u00ec";
            case FRIDAY: return "Venderd\u00ec";
            case SATURDAY: return "Sabato";
            case THURSDAY: return "Gioved\u00ec";
            case TUESDAY: return "Marted\u00ec";
            case WEDNESDAY: return "Mercoled\u00ec";
            default: return  "Domenica";
        }
    }

}
