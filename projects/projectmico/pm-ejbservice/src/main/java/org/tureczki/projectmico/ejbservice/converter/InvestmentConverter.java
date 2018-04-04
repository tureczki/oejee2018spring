package org.tureczki.projectmico.ejbservice.converter;

import java.util.List;
import javax.ejb.*;
import org.tureczki.projectmico.ejbservice.domain.InvestmentStub;
import org.tureczki.persistence.entity.Investment;

@Local
public interface InvestmentConverter{
	InvestmentStub to(Investment investment);
//	List<InvestmentStub> to(List<Investment> investments);
}