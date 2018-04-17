package org.tureczki.persistence.service;

import org.tureczki.persistence.entity.*;
import javax.ejb.*;
import javax.persistence.*;
import org.apache.log4j.Logger;

@Stateless(mappedName = "ejb/userService")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class UserServiceImpl implements UserService {

 private static final org.apache.log4j.Logger LOGGER = Logger.getLogger(UserServiceImpl.class);

 @PersistenceContext(unitName = "pm-persistence-unit")
 private EntityManager entityManager;

 @Override
 public User readUser(String email) throws Exception {
  User user = null;
  try {
   user = this.entityManager.createNamedQuery(User.GET_BY_EMAIL,
    User.class).setParameter("email", email).getSingleResult();
  } catch (final Exception e) {
   LOGGER.error(e.getMessage());
   LOGGER.error(e.getLocalizedMessage());
  }
  return user;
 }
}