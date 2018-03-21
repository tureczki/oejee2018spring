package org.tureczki.projectmico.ejbservice.facade;

@Stateless(mappedName = "ejb/investmentFacade")
public class InvestmentFacadeImpl extends InvestmentFacade {

	@Override
	public InvestmentStub getInvestment(String investmentID) throws FacadeException{
		return new InvestmentStub("TBP4TKWI", investmentID,
				"9793979", InvestmentCategoryStub.ETH);
	}
	
	@Override
	public List<InvestmentStub> getInvestments(InvestmentCriteria criteria) throws FacadeException{
	List<InvestmentStub> stubs = new ArrayList<InvestmentStub>();
	stubs.add(new InvestmentStub("TBP4TKWI", "MENT9429348",
			"79757", InvestmentCategoryStub.ETH));
	stubs.add(new InvestmentStub("TBP4TKWI", "MENT9429777",
			"99759", InvestmentCategoryStub.BTC));
		return stubs;	
	}
}
