package com.moveo.aem.training.core.services;


import com.moveo.aem.training.core.beans.DailyWeatherBean;

import java.util.List;

public interface WeatherService {

    public List<DailyWeatherBean> getDailyForecast(String latitudine, String longitudine) throws Exception;
}
