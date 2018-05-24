package org.tureczki.projectmico.weblayer;

import javax.jws.WebService;

// @WebService(endpointInterface = org.tureczki.projectmico.weblayer.SOAPWebService)
public class SOAPWebServiceImpl implements SOAPWebService {

 public String pingMe(String me){
	 return "ping";
 }

}