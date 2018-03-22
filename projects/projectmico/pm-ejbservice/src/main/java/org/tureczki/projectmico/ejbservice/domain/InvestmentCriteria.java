package org.tureczki.projectmico.ejbservice.domain;

import java.math.BigDecimal;

public class InvestmentCriteria {
	
	private String investorID;
	private InvestmentCategoryStub investmentCategory;
	private BigDecimal minInvestedAmount;
	private BigDecimal maxInvestedAmount;
	
	public InvestmentCriteria(){
	
	}
}
