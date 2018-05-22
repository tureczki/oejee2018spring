package org.tureczki.projectmico.weblayer.servlet;

import org.tureczki.projectmico.ejbservice.domain.*;
import org.tureczki.projectmico.ejbservice.facade.InvestmentFacade;
import org.tureczki.projectmico.ejbservice.exception.FacadeException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import org.apache.log4j.Logger;
import javax.servlet.RequestDispatcher;
import org.tureczki.projectmico.ejbservice.facade.UserFacade;
import com.google.gson.*;
import org.json.*;

@WebServlet("/history")
public class DemoHistoryServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
		ServletException, IOException {	
		
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
		
	    String json = new Gson().toJson(ja);
	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(json);
	    request.setAttribute("listofcurrencies", json);
	    
        RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher("/WEB-INF/demohistory.jsp");
        dispatcher.forward(request, response);
	}
}