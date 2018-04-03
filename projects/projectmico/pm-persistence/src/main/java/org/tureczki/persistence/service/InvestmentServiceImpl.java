package org.tureczki.persistence.entity.service;

@Stateless(mappedName = "ejb/investmentService")
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class InvestmentServiceImpl implements InvestmentService{
	
	@PersistenceContext(unitName = "pm-persistence-unit")
	private EntityManager entityManager;
	
	@Override
	public Investment read(final String investment_id) throws PersistenceServiceException{
		Investment result = null;
		try{
			result = this.entityManager.createNamedQuery(Investment.GET_BY_INVESTMENTID,
					Investment.class).setParameter("investment_ID", investment_id).getSingleResult();
			catch(final Exception e){
				throws new PersistenceServiceException("Unknown error when fetching invesmtent by"
						+ "investment ID (" + investment_id + ")!" + e.getLocalizedMessage().e);				
			}
		}
		return result;
	}
	
}