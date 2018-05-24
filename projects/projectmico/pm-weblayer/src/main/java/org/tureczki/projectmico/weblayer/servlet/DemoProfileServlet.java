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

@WebServlet("/profile")
public class DemoProfileServlet extends HttpServlet {
	
	private static final Logger LOGGER = Logger.getLogger(DemoProfileServlet.class);
	
	@EJB
	private UserFacade facade;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
		ServletException, IOException {	
		
		String email = request.getParameter("email");
		
		try{
			
			UserStub userstub = this.facade.getUserStub(email);
			request.setAttribute("userstub", userstub);
		
		} catch(final Exception e){
		
			LOGGER.error(e, e);
			throw new IOException(e.getLocalizedMessage());
		
		}
	    
        RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher("/WEB-INF/demoprofile.jsp");
        dispatcher.forward(request, response);
	}
}