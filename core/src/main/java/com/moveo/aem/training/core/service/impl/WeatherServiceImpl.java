package com.moveo.aem.training.core.service.impl;

import com.moveo.aem.training.core.service.DailyWeatherBean;
import com.moveo.aem.training.core.service.WeatherService;

import java.util.List;

public class WeatherServiceImpl implements WeatherService {

    @Override
    public List<DailyWeatherBean> getDailyForecast(String latitudine, String longitudine) {

        String url="https://api.openweathermap.org/data/2.5/onecall?lat="+latitudine+"&lon="+longitudine
                +"&exclude=current,minutely,hourly,alerts&units=metric&appid=080edcb7e503a9b8450dfeff30eeec64";
        String response = httpclient

        List<>



        return null;

    }

}
