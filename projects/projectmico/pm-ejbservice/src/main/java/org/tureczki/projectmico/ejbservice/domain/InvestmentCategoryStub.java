package org.tureczki.projectmico.ejbservice.domain;

import java.math.BigDecimal;

public enum InvestmentCategoryStub {
	USD("United States Dollar"),
	EUR("Euro"),
	HUF("Hungarian Forint"),
	ETH("Ethereum"),
	BTC("Bitcoin");
	
	private final String label;
	
	private InvestmentCategoryStub(String label){
		this.label = label;
	}
	
	public String getLabel(){
		return this.label;
	}
	
	public String getName(){
		return this.name();
	}
}
