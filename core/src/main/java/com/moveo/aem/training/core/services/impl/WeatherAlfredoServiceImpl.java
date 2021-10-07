package com.moveo.aem.training.core.services.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.moveo.aem.training.core.services.WeatherAlfredoService;
import com.moveo.aem.training.core.services.WeatherAlfredoServiceDesegnate;
import com.moveo.aem.training.core.beans.DailyWeatherAlfredoBean;
import com.moveo.aem.training.core.beans.response.meteoalfredo.Daily;
import com.moveo.aem.training.core.beans.response.meteoalfredo.DailyWeatherAlfredoResponse;
import com.moveo.aem.training.core.utils.HttpClientAlfredo;
import com.moveo.aem.training.core.utility.Utils;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

@Designate(ocd = WeatherAlfredoServiceDesegnate.class)
@Component(service = {WeatherAlfredoService.class})
public class WeatherAlfredoServiceImpl implements WeatherAlfredoService {


    private String appKey;

    private static Logger logger = LoggerFactory.getLogger(WeatherAlfredoServiceImpl.class);

    @Activate
    protected void activate(final WeatherAlfredoServiceDesegnate config) {
        appKey = config.apiId();
    }

    @Override
    public List<DailyWeatherAlfredoBean> getDailyForecast(String latitudine, String longitudine) throws Exception{
        String url = "https://api.openweathermap.org/data/2.5/onecall?lat="+latitudine+"&lon="+longitudine+"&exclude=current,minutely,hourly,alerts&units=metric&&appid="+appKey;

        String resp = HttpClientAlfredo.getJsonMeteo(url);
        ObjectMapper mapper = new ObjectMapper();
        DailyWeatherAlfredoResponse dailyWeatherAlfredoResponse = mapper.readValue(resp, DailyWeatherAlfredoResponse.class);

        List<DailyWeatherAlfredoBean> dailyWeatherAlfredoBeanList =  new ArrayList<DailyWeatherAlfredoBean>();

        for(Daily dailyWeatherRes: dailyWeatherAlfredoResponse.getDaily() ){
            // creo un'istanza del bean
            DailyWeatherAlfredoBean dailyWeatherAlfredoBean = new DailyWeatherAlfredoBean();

            // prendo la stinga date time e creo un oggetto che ha le singole proprietà
            LocalDateTime localdatetime = LocalDateTime.ofEpochSecond(dailyWeatherRes.getDt(),0, ZoneOffset.UTC);
            // imposto le proprietà che mi interessano
            // giorno settimana
            dailyWeatherAlfredoBean.setDay(Utils.translateDay(localdatetime.getDayOfWeek().toString()));
            // icona
            dailyWeatherAlfredoBean.setIcon(dailyWeatherRes.getWeather().get(0).getIcon());
            // descrizione
            dailyWeatherAlfredoBean.setDescrizione(dailyWeatherRes.getWeather().get(0).getDescription());
            // temp min
            dailyWeatherAlfredoBean.setTemperaturaMinima(dailyWeatherRes.getTemp().getMin().toString());
            // temp max
            dailyWeatherAlfredoBean.setTemperaturaMassima(dailyWeatherRes.getTemp().getMax().toString());


            // aggiungo la singola istanza alla lista
            dailyWeatherAlfredoBeanList.add(dailyWeatherAlfredoBean);
        }

        return dailyWeatherAlfredoBeanList;
    }
}
