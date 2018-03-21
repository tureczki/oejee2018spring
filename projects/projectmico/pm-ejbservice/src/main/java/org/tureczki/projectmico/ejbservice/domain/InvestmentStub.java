package hu.tureczki.projectmico.ejbservice.domain;

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
		this.category = investmentCategory;
	}
}
