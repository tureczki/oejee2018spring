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
		
	    request.setAttribute("id", "0");
	    request.setAttribute("email", "programmer.tureczki@greattureczkibank.eu");
	    request.setAttribute("productname", "mICO"); 
	    request.setAttribute("date", "2018.05.24.");    
	    request.setAttribute("amount", "20000");
	    request.setAttribute("price", "0.0001");
	    request.setAttribute("currencyname", "BTC");
	    
        RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher("/WEB-INF/demohistory.jsp");
        dispatcher.forward(request, response);
	}
}