package com.moveo.aem.training.core.beans;

public class DailyWeatherAlfredoBean {

    private String day;
    private String icon;
    private String temperaturaMinima;
    private String temperaturaMassima;
    private String dayStr;
    private String descrizione;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(String temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public String getTemperaturaMassima() {
        return temperaturaMassima;
    }

    public void setTemperaturaMassima(String temperaturaMassima) {
        this.temperaturaMassima = temperaturaMassima;
    }

    public String getDayStr() {
        return dayStr;
    }

    public void setDayStr(String dayStr) {
        this.dayStr = dayStr;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
