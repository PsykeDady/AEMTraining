package com.moveo.aem.training.core.beans.bitcoin.davide;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Root{
    @JsonProperty("config") 
    public Config getConfig() { 
		 return this.config; } 
    public void setConfig(Config config) { 
		 this.config = config; } 
    Config config;
    @JsonProperty("usage") 
    public Usage getUsage() { 
		 return this.usage; } 
    public void setUsage(Usage usage) { 
		 this.usage = usage; } 
    Usage usage;
    @JsonProperty("data") 
    public List<Datum> getData() { 
		 return this.data; } 
    public void setData(List<Datum> data) { 
		 this.data = data; } 
    List<Datum> data;
}
