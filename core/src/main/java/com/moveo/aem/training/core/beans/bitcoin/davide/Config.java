package com.moveo.aem.training.core.beans.bitcoin.davide;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Config{
    @JsonProperty("data") 
    public String getData() { 
		 return this.data; } 
    public void setData(String data) { 
		 this.data = data; } 
    String data;
    @JsonProperty("symbol") 
    public String getSymbol() { 
		 return this.symbol; } 
    public void setSymbol(String symbol) { 
		 this.symbol = symbol; } 
    String symbol;
    @JsonProperty("interval") 
    public String getInterval() { 
		 return this.interval; } 
    public void setInterval(String interval) { 
		 this.interval = interval; } 
    String interval;
    @JsonProperty("data_points") 
    public int getData_points() { 
		 return this.data_points; } 
    public void setData_points(int data_points) { 
		 this.data_points = data_points; } 
    int data_points;
}
