package com.moveo.aem.training.core.beans.bitcoin.davide;

public enum Cryptos {
	BTC("Bitcoin"),
	DOGE("Dogecoin"),
	ADA("Cardano"),
	DXCT("DNAxCAT Token");


	private String longName; 
	private Cryptos(String longName){
		this.longName=longName;
	}
	public String getLongName(){
		return longName;
	}
}
