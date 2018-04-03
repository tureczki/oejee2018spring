package org.tureczki.projectmico.ejbservice.converter;

@Local
public interface InvestmentConverter{
	InvestmentStub to(Investment investment);
	List<InvestmentStub> to(List<Investment> investments);
}