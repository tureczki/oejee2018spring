package org.tureczki.projectmico.weblayer;

import javax.jws.WebService;

@WebService
public interface SOAPWebService {

	public String pingMe(String me);

}