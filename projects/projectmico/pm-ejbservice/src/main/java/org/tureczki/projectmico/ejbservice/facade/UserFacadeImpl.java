package org.tureczki.persistence.service;

import org.tureczki.persistence.service.UserService;
import org.tureczki.projectmico.ejbservice.converter.UserConverter;
import org.tureczki.projectmico.ejbservice.domain.UserStub;
import org.tureczki.projectmico.ejbserviceclient.domain.UserStubRemote;
import org.tureczki.projectmico.ejbservice.facade.UserFacade;
import org.tureczki.projectmico.ejbserviceclient.UserFacadeRemote;
import javax.ejb.*;
import org.apache.log4j.Logger;
import javax.xml.rpc.ServiceException;

@Stateless(mappedName = "ejb/userFacade", name = UserFacadeRemote.BEAN_NAME)
public class UserFacadeImpl implements UserFacade, UserFacadeRemote {

 private static final Logger LOGGER = Logger.getLogger(UserFacadeImpl.class);

 @EJB
 private UserService service;

 @EJB
 private UserConverter converter;
 
 @Override
 public UserStub getUserStub(String email) throws Exception {
  try {
   final UserStub stub = this.converter.to(this.service.readUser(email));
   if (LOGGER.isDebugEnabled()) {
    LOGGER.debug("Get user by email (" + email + ") --> " + stub);
   }
   return stub;
  } catch (final Exception e) {
   LOGGER.error(e, e);
   throw new Exception(e.getLocalizedMessage());
  }
 }
 
 @Override
 public UserStubRemote getUserStubRemote(String email) throws Exception {
  try {
   final UserStub user = this.converter.to(this.service.readUser(email));
   UserStubRemote stub = new UserStubRemote(user.getEmail(), user.getPasswordhash(), user.getExperience(), user.getSubscriber(), user.getTheme(), user.getCurrency());
   if (LOGGER.isDebugEnabled()) {
    LOGGER.debug("Get user by email (" + email + ") --> " + stub);
   }
   return stub;
  } catch (final Exception e) {
   LOGGER.error(e, e);
   throw new Exception(e.getLocalizedMessage());
  }
 }
}