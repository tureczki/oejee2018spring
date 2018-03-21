package hu.tureczki.projectmico.ejbservice.facade;

import java.util.List;
import javax.ejb.Local;
import hu.tureczki.projectmico.ejbservice.domain.InvestmentCriteria;
import hu.tureczki.projectmico.ejbservice.domain.InvestmentStub;
import hu.tureczki.projectmico.ejbservice.exception.FacadeException;

@Local
public class InvestmentFacade {
	
	InvestmentStub getInvestment(String investmentID) throws FacadeException;
	List<InvestmentStub> getInvestments(InvestmentCriteria criteria) throws FacadeException;
}
