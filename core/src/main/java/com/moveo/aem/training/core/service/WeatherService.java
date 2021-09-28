package com.moveo.aem.training.core.service;

import java.util.List;

public interface WeatherService {

    public List<DailyWeatherBean> getDailyForecast(String latitudine, String longitudine);

}
