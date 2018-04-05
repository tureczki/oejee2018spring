package org.tureczki.projectmico.weblayer.servlet;

import org.tureczki.projectmico.ejbservice.domain.InvestmentStub;
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
		
		String investmentID = request.getParameter("investmentid");
		
		try{
			InvestmentStub investment = this.facade.getInvestment(investmentID);
			request.setAttribute("investment", investment);
		} catch(final FacadeException e){
			LOGGER.error(e, e);
		}
		
        RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher("/WEB-INF/investment.jsp");
        dispatcher.forward(request, response);
		
		
		/* 
		LOGGER.info("Get investment by user.");
		response.setCharacterEncoding("UTF-8");
		final PrintWriter out = response.getWriter();
		try {
			final InvestmentStub investment = this.facade.getInvestment("49234982");
			out.println(investment.toString());
		}
		catch(final FacadeException e) {
			out.println(e.getLocalizedMessage());
		}
		out.close(); */
		
	}
}
