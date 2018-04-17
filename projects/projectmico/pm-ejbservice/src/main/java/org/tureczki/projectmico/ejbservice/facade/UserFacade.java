package org.tureczki.projectmico.ejbservice.facade;

import javax.ejb.Local;
import org.tureczki.projectmico.ejbservice.domain.UserFacadeStub;

@Local
public interface UserFacade {
	
	UserFacadeStub getUser(String email) throws Exception;

}
