package com.moveo.aem.training.core.services;

import com.moveo.aem.training.core.beans.DailyWeatherAlfredoBean;

import java.util.List;

public interface WeatherAlfredoService {

    public List<DailyWeatherAlfredoBean> getDailyForecast(String latitudine, String longitudine) throws Exception;
}
