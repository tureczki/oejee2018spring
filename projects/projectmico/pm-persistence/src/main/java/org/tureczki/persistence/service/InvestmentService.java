package org.tureczki.projectmico.persistence.service;

@Local
public interface InvestmentService{
	Investment read(String investor_id) throws PersistenceServiceException;
	List<Investment> readAll() throws PersistenceServiceException;
}