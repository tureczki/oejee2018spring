package org.tureczki.projectmico.ejbservice.facade;

import java.util.List;
import javax.ejb.Local;
import org.tureczki.projectmico.ejbservice.domain.InvestmentCriteria;
import org.tureczki.projectmico.ejbservice.domain.InvestmentStub;
import org.tureczki.projectmico.ejbservice.exception.FacadeException;

@Local
public interface InvestmentFacade {
	
	InvestmentStub getInvestment(String investmentID) throws FacadeException;
	List<InvestmentStub> getInvestments(InvestmentCriteria criteria) throws FacadeException;

}
