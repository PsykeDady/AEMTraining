package com.moveo.aem.training.core.service_gezu.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.moveo.aem.training.core.service_gezu.WeatherServiceGezu;
import com.moveo.aem.training.core.service_gezu.WeatherServiceDesignate;
import com.moveo.aem.training.core.services.WeatherServiceDesegnate;
import com.moveo.aem.training.core.services.beans.DailyWeatherBean;
import com.moveo.aem.training.core.services.beans.response.weather.Daily;
import com.moveo.aem.training.core.services.beans.response.weather.DailyWeatherResponse;
import com.moveo.aem.training.core.utils.HttpClientGezu;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

@Designate(ocd = WeatherServiceDesegnate.class)
@Component(service = {WeatherServiceGezu.class})
public class WeatherServiceGezuImpl implements WeatherServiceGezu {


    private String appKey;
    private static Logger logger = LoggerFactory.getLogger(WeatherServiceGezuImpl.class);


    @Activate
    protected void activate(final WeatherServiceDesignate config) {

        appKey = config.apiId();
    }


    @Override
    public List<DailyWeatherBean> getDailyForecast(String latitudine, String longitudine) throws Exception {
        logger.debug("WeatherServiceImpl INFO");
        String url = "https://api.openweathermap.org/data/2.5/onecall?lat="+latitudine+"&lon="+longitudine+"&lang=it&exclude=minutely,current,hourly,alerts&units=metric&appid="+appKey;
        String response = HttpClientGezu.executeGet(url);
        ObjectMapper objectMapper = new ObjectMapper();
        DailyWeatherResponse dailyWeatherResponse = objectMapper.readValue(response, DailyWeatherResponse.class);
        List<DailyWeatherBean> dailyWeatherBeanList = new ArrayList<DailyWeatherBean>();

        for (Daily dailyWeatherResp : dailyWeatherResponse.getDaily()){
            // TODO: convertire epoch to Date
            DailyWeatherBean dailyWeatherBean = new DailyWeatherBean();
            LocalDateTime localdatetime=LocalDateTime.ofEpochSecond(dailyWeatherResp.getDt(),0, ZoneOffset.UTC);
            dailyWeatherBean.setDay(localdatetime.getDayOfWeek().toString());
            dailyWeatherBean.setTempMax(dailyWeatherResp.getTemp().getMax().toString());
            dailyWeatherBean.setTempMin(dailyWeatherResp.getTemp().getMin().toString());
            dailyWeatherBean.setIcon(dailyWeatherResp.getWeather().get(0).getIcon());
            dailyWeatherBean.setDescription(dailyWeatherResp.getWeather().get(0).getDescription());
            dailyWeatherBeanList.add(dailyWeatherBean);
        }
        return  dailyWeatherBeanList;
    }


}
