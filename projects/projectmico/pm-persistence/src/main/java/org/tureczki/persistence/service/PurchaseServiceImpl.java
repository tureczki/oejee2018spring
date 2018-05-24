package org.tureczki.persistence.service;

import org.tureczki.persistence.entity.*;
import javax.ejb.*;
import javax.persistence.*;
import org.apache.log4j.Logger;

@Stateless(mappedName = "ejb/purchaseService")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class PurchaseServiceImpl implements PurchaseService {

 private static final org.apache.log4j.Logger LOGGER = Logger.getLogger(PurchaseServiceImpl.class);

 @PersistenceContext(unitName = "pm-persistence-unit")
 private EntityManager entityManager;

 @Override
 public Purchase readPurchases() throws Exception {
  Purchase purchase = null;
  try {
	  purchase = this.entityManager.createNamedQuery(Purchase.GET_ALL,
    Purchase.class).getSingleResult();
  } catch (final Exception e) {
   LOGGER.error(e.getMessage());
   LOGGER.error(e.getLocalizedMessage());
  }
  return purchase;
 }
}