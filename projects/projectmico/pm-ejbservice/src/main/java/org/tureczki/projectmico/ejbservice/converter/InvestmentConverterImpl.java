package org.tureczki.projectmico.ejbservice.converter;

import java.math.BigDecimal;
import java.util.List;
import javax.ejb.*;
import org.tureczki.projectmico.ejbservice.domain.*;
import org.tureczki.persistence.entity.Investment;

@Stateless
public class InvestmentConverterImpl implements InvestmentConverter{
	
	@Override
	public InvestmentStub to(Investment investment){
		final InvestmentCategoryStub category =
				InvestmentCategoryStub.valueOf(investment.getInvestmentCategory().toString());
		return new InvestmentStub(String.valueOf(investment.getInvestorID()), String.valueOf(investment.getInvestmentID()),
				investment.getInvestedAmount(), category);
	}
}