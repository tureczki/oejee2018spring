package org.tureczki.projectmico.ejbservice.facade;

import javax.ejb.Local;
import org.tureczki.projectmico.ejbservice.domain.UserStub;

@Local
public interface UserFacade {
	
	UserStub getUserStub(String email) throws Exception;

}
