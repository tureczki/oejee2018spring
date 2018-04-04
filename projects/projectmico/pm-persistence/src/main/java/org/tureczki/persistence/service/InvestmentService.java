package org.tureczki.persistence.service;

import org.tureczki.persistence.entity.Investment;
import java.util.List;
import javax.ejb.Local;
import org.tureczki.persistence.entity.trunk.InvestmentCategory;
// import org.tureczki.persistence.persistence.exception.PersistenceServiceException;

@Local
public interface InvestmentService{
	Investment read(String investor_id) throws Exception;
//	List<Investment> readAll() throws Exception;
}