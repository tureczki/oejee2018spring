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
	    jsonObject.put("name", "Bitcoin"); 
	    jsonObject.put("unitcode", "BTC"); 
	    jsonObject.put("valueinusd", "8000"); 
	    ja.put(jsonObject);
	    
		jsonObject = new JSONObject();
	    jsonObject.put("name", "Litecoin"); 
	    jsonObject.put("unitcode", "LTC"); 
	    jsonObject.put("valueinusd", "137");
	    ja.put(jsonObject);
	    
		jsonObject = new JSONObject();
	    jsonObject.put("name", "Dogecoin"); 
	    jsonObject.put("unitcode", "DOGE"); 
	    jsonObject.put("valueinusd", "0.004242"); 
	    ja.put(jsonObject);

	    JSONObject mainObj = new JSONObject();
	    mainObj.put("currencies", ja);
	    
	    
		return Response.status(200).entity(mainObj.toString()).build();
	}
	
}