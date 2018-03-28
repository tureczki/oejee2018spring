package org.tureczki.projectmico.ejbservice.domain;

import java.math.BigDecimal;

public class InvestmentStub {
	
	private String investorID;
	private String investmentID;
	private BigDecimal investedAmount;
	private InvestmentCategoryStub investmentCategory;
	
	public InvestmentStub(String investorID, String investmentID,
			BigDecimal investedAmount, InvestmentCategoryStub investmentCategory ){
		this.investorID = investorID;
		this.investmentID = investmentID;
		this.investedAmount = investedAmount;
		this.investmentCategory = investmentCategory;
	}
	 
	public String toString(){ 
	  return "Investment ID: " + this.investmentID;  
	 } 
	
}
