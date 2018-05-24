package org.tureczki.projectmico.ejbservice.facade;

import javax.ejb.Local;
import org.tureczki.projectmico.ejbservice.domain.PurchaseStub;

@Local
public interface PurchaseFacade {
	
	PurchaseStub getPurchaseStub() throws Exception;

}
