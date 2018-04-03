package org.tureczki.projectmico.ejbservice.converter;

import java.math.BigDecimal;

@Stateless
public class InvestmentConverterImpl implements InvestmentConverter{
	
	@Override
	public InvestmentStub to(Investment investment){
		final InvestmentCategoryStub category =
				InvestmentCategoryStub.valueOf(investment.getCategory().toString());
		return new InvestmentStub(investment.getinvestorID(), investment.getinvestmentID(),
				investment.getinvestedAmount(), category);
	}
}