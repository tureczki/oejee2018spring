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

@WebServlet("/InvestmentPing")
public class InvestmentPingServlet extends HttpServlet {

	private static final Logger LOGGER = Logger.getLogger(InvestmentPingServlet.class);
	
	@EJB
	private InvestmentFacade facade;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
		ServletException, IOException {
		
		String azonosito = request.getParameter("azonosito");
		
		try{
			TesztadatStub tesztadat = this.facade.getTesztadat(azonosito);
			request.setAttribute("tesztadat", tesztadat);
		} catch(final Exception e){
			LOGGER.error(e, e);
			throw new IOException(e.getLocalizedMessage());
		}
		
        RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher("/WEB-INF/investment.jsp");
        dispatcher.forward(request, response);
		
	}
}
