package org.tureczki.persistence.service;

import org.tureczki.persistence.entity.Investment;
import org.tureczki.persistence.entity.Tesztadat;
import java.util.List;
import javax.ejb.*;
import javax.persistence.*;
import org.tureczki.persistence.entity.trunk.InvestmentCategory;
import org.apache.log4j.Logger;

@Stateless(mappedName = "ejb/investmentService")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class InvestmentServiceImpl implements InvestmentService{
	
	private static final org.apache.log4j.Logger LOGGER = Logger.getLogger(InvestmentServiceImpl.class);

	
	@PersistenceContext(unitName = "pm-persistence-unit")
	private EntityManager entityManager;
	
	@Override
	public Tesztadat read(final String azonosito) throws Exception{
		Tesztadat result = new Tesztadat("ZOLTAN");
		try{
			result = this.entityManager.createNamedQuery(Tesztadat.GET_BY_AZONOSITO,
					Tesztadat.class).getSingleResult();
					}
		catch(final Exception e)								
		{
			LOGGER.info("SZAR A QUERY");
			LOGGER.info(e.getMessage());
			LOGGER.info(e.getLocalizedMessage());
			LOGGER.info("SZAR A QUERY");
			 result = new Tesztadat("MARY");
		}
		return result;
	}
	
}