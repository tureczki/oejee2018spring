package org.tureczki.projectmico.ejbserviceclient;

import javax.ejb.Remote;
import org.tureczki.projectmico.ejbserviceclient.domain.UserStubRemote;

@Remote
public interface UserFacadeRemote{
	
	String BEAN_NAME = "UserService";
	UserStubRemote getUserStubRemote (String email) throws Exception;
	
}