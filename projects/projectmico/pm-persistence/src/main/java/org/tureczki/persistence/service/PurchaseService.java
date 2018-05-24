package org.tureczki.persistence.service;

import org.tureczki.persistence.entity.Purchase;
import javax.ejb.Local;

@Local
public interface PurchaseService{
	Purchase readPurchases() throws Exception;
}