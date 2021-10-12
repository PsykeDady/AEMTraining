package com.moveo.aem.training.core.beans.bitcoin.davide;
import com.fasterxml.jackson.annotation.JsonProperty;
public class Usage{
    @JsonProperty("day") 
    public int getDay() { 
		 return this.day; } 
    public void setDay(int day) { 
		 this.day = day; } 
    int day;
    @JsonProperty("month") 
    public int getMonth() { 
		 return this.month; } 
    public void setMonth(int month) { 
		 this.month = month; } 
    int month;
}
