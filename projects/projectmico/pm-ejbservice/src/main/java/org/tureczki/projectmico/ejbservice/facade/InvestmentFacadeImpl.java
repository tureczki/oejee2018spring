package org.tureczki.projectmico.ejbservice.facade;

import javax.ejb.Stateless;
import java.util.List;
import org.apache.log4j.Logger;

import org.tureczki.projectmico.ejbservice.domain.InvestmentStub;
import org.tureczki.projectmico.ejbservice.domain.InvestmentCriteria;
import org.tureczki.projectmico.ejbservice.domain.InvestmentCategoryStub;
import org.tureczki.projectmico.ejbservice.exception.FacadeException;
import java.math.BigDecimal;
import java.util.ArrayList;

@Stateless(mappedName = "ejb/investmentFacade")
public class InvestmentFacadeImpl implements InvestmentFacade {

	private static final Logger LOGGER = Logger.getLogger(InvestmentFacadeImpl.class);
	
	
	@Override
	public InvestmentStub getInvestment(String investmentID) throws FacadeException{
		if(LOGGER.isDebugEnabled()){
			LOGGER.debug("Get investment (investment ID: " + investmentID + ") ");
		}
		return new InvestmentStub("TBP4TKWI", investmentID,
				new BigDecimal(9793979), InvestmentCategoryStub.ETH);
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
