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
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.lang.FunctionalInterface;
import org.tureczki.projectmico.weblayer.servlet.*;


@WebServlet("/democurrencies")
public class DemoCurrenciesServlet extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
		ServletException, IOException {	
		  
		   ArrayList<String> listofcurrencies = new ArrayList<String>();
			
		   String recv;
		   String recvbuff = "";
		   URL jsonpage = new URL("http://localhost:8080/projectmico/api/currency/list");
		   URLConnection urlcon = jsonpage.openConnection();
		   BufferedReader buffread = new BufferedReader(new InputStreamReader(urlcon.getInputStream()));

		   while ((recv = buffread.readLine()) != null)
		    recvbuff += recv;
		   buffread.close();
		   
		   JSONObject jsonObj = new JSONObject(recvbuff);
		   JSONArray ja = jsonObj.getJSONArray("currencies");
		   
		   for (int i=0; i<ja.length(); i++) {
			    JSONObject item = ja.getJSONObject(i);
			    String name = item.getString("name");
			    String unitcode = item.getString("unitcode");
			    String valueinusd = item.getString("valueinusd");
			    listofcurrencies.add(name);
			    listofcurrencies.add(unitcode);
			    listofcurrencies.add(valueinusd);
			}
		   
			  request.setAttribute("listofcurrencies", listofcurrencies);
		  
		  Consumer consumer = DemoCurrenciesServlet::createJSON;	   
		  consumer.accept("something");
		  
		  RequestDispatcher dispatcher = getServletContext()
	                .getRequestDispatcher("/WEB-INF/democurrencies.jsp");
	        dispatcher.forward(request, response);
	   
	}
	
   private static void createJSON(java.lang.Object o){
	   
		  
	       
   }
}