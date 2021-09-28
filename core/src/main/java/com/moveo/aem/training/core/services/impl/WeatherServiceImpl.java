package com.moveo.aem.training.core.services.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.moveo.aem.training.core.services.beans.DailyWeatherBean;
import com.moveo.aem.training.core.services.WeatherService;
import com.moveo.aem.training.core.services.beans.response.weather.Daily;
import com.moveo.aem.training.core.services.beans.response.weather.DailyWeatherResponse;
import com.moveo.aem.training.core.utils.HttpClientFrancesco;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;


@Component(service = {WeatherService.class})
public class WeatherServiceImpl implements WeatherService {

    private static Logger logger = LoggerFactory.getLogger(WeatherServiceImpl.class);

    @Override
    public List<DailyWeatherBean> getDailyForecast(String latitudine, String longitudine) throws Exception {
        logger.debug("entrato in WeatherServiceImpl");
        String url = "https://api.openweathermap.org/data/2.5/onecall?lat="+latitudine+"&lon="+longitudine+"&lang=it&exclude=minutely,current,hourly,alerts&units=metric&appid=777a8a95a8fe7b0637a7daf3a860d216";
        String response = HttpClientFrancesco.executeGet(url);
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
