package org.tureczki.projectmico.ejbservice.facade;

import javax.ejb.*;
import java.util.List;
import org.apache.log4j.Logger;
import org.tureczki.projectmico.ejbservice.domain.InvestmentStub;
import org.tureczki.projectmico.ejbservice.domain.InvestmentCriteria;
import org.tureczki.projectmico.ejbservice.domain.InvestmentCategoryStub;
import org.tureczki.projectmico.ejbservice.exception.FacadeException;
import org.tureczki.persistence.service.*;
import org.tureczki.projectmico.ejbservice.converter.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.tureczki.projectmico.ejbservice.domain.TesztadatStub;

@Stateless(mappedName = "ejb/investmentFacade")
public class InvestmentFacadeImpl implements InvestmentFacade {

	private static final Logger LOGGER = Logger.getLogger(InvestmentFacadeImpl.class);

	@EJB
	private InvestmentService service;
	
	@EJB
	private InvestmentConverter converter;
	
	@Override
	public TesztadatStub getTesztadat(String azonosito) throws Exception {
		try {
			final TesztadatStub stub = this.converter.to(this.service.read(azonosito));
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Get investment by investment_id (" + azonosito + ") --> " + stub);
			}
			return stub;
		} catch (final Exception e) {
			LOGGER.error(e, e);
			throw new Exception(e.getLocalizedMessage());
		}
}
	
	@Override
	public List<InvestmentStub> getInvestments(InvestmentCriteria criteria) throws FacadeException{
	List<InvestmentStub> stubs = new ArrayList<InvestmentStub>();
	stubs.add(new InvestmentStub("TBP4TKWI", "MENT9429348",
			new BigDecimal(79757), InvestmentCategoryStub.ETH));
	stubs.add(new InvestmentStub("TBP4TKWI", "MENT9429777",
			new BigDecimal(99759), InvestmentCategoryStub.BTC));
		return stubs;	
	}
}
