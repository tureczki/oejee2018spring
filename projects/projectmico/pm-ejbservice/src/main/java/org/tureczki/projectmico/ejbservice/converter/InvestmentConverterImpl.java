package org.tureczki.projectmico.ejbservice.converter;

import java.math.BigDecimal;
import java.util.List;
import javax.ejb.*;
import org.tureczki.projectmico.ejbservice.domain.*;
import org.tureczki.persistence.entity.*;

@Stateless
public class InvestmentConverterImpl implements InvestmentConverter{
	
	@Override
	public TesztadatStub to(Tesztadat tesztadat){
	//	final InvestmentCategoryStub category =
	//			InvestmentCategoryStub.valueOf(investment.getInvestmentCategory().toString());
		return new TesztadatStub(tesztadat.getAzonosito());
	}
}