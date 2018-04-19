package org.tureczki.projectmico.ejbserviceclient;

import javax.ejb.Remote;
import org.tureczki.projectmico.ejbserviceclient.domain.UserStub;

@Remote
public interface UserFacadeRemote{
	
	String BEAN_NAME = "UserService";
	UserStub getUserStub (String email) throws ServiceExceptions;
	
}