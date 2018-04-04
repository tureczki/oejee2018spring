package org.tureczki.persistence.service;

import org.tureczki.persistence.entity.Investment;
import java.util.List;
import javax.ejb.*;
import javax.persistence.*;
import org.tureczki.persistence.entity.trunk.InvestmentCategory;

@Stateless(mappedName = "ejb/investmentService")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class InvestmentServiceImpl implements InvestmentService{
	
	@PersistenceContext(unitName = "pm-persistence-unit")
	private EntityManager entityManager;
	
	@Override
	public Investment read(final String investment_id) throws Exception{
		Investment result = null;
		try{
			result = this.entityManager.createNamedQuery(Investment.GET_BY_INVESTMENTID,
					Investment.class).setParameter("investment_ID", investment_id).getSingleResult();
					}
		catch(final Exception e)								
		{
		}
		return result;
	}
	
}