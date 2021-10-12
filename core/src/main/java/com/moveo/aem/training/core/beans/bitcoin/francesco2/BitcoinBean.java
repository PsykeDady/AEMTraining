package com.moveo.aem.training.core.beans.bitcoin.francesco2;

public class BitcoinBean {

    private String symbol;
    private int max_supply;
    private double price;
    private double percent_change_24h;
    private double percent_change_7d;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getMax_supply() {
        return max_supply;
    }

    public void setMax_supply(int max_supply) {
        this.max_supply = max_supply;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPercent_change_24h() {
        return percent_change_24h;
    }

    public void setPercent_change_24h(double percent_change_24h) {
        this.percent_change_24h = percent_change_24h;
    }

    public double getPercent_change_7d() {
        return percent_change_7d;
    }

    public void setPercent_change_7d(double percent_change_7d) {
        this.percent_change_7d = percent_change_7d;
    }
}
