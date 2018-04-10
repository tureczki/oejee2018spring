package org.tureczki.projectmico.ejbservice.converter;

import java.util.List;
import javax.ejb.*;
import org.tureczki.projectmico.ejbservice.domain.*;
import org.tureczki.persistence.entity.*;

@Local
public interface InvestmentConverter{
	TesztadatStub to(Tesztadat tesztadat);
//	List<InvestmentStub> to(List<Investment> investments);
}