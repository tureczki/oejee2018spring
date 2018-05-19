package org.tureczki.projectmico.weblayer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.*;

@Path("/currency")
public class CurrencyRestService{
	
	@GET
	@Path("/list")
	@Produces("application/json")
	public Response getAllCurrencies(){
		
	    JSONArray ja = new JSONArray();
		
		JSONObject jsonObject = new JSONObject();
	    jsonObject.put("Name", "Bitcoin"); 
	    jsonObject.put("Code/Unit", "BTC"); 
	    jsonObject.put("USD value", "8000"); 
	    ja.put(jsonObject);
	    
		jsonObject = new JSONObject();
	    jsonObject.put("Name", "Litecoin"); 
	    jsonObject.put("Code/Unit", "LTC"); 
	    jsonObject.put("USD value", "137");
	    ja.put(jsonObject);
	    
		jsonObject = new JSONObject();
	    jsonObject.put("Name", "Dogecoin"); 
	    jsonObject.put("Code/Unit", "DOGE"); 
	    jsonObject.put("USD value", "0.004242"); 
	    ja.put(jsonObject);

	    JSONObject mainObj = new JSONObject();
	    mainObj.put("currencies", ja);
	    
	    
		return Response.status(200).entity(mainObj.toString()).build();
	}
	
}