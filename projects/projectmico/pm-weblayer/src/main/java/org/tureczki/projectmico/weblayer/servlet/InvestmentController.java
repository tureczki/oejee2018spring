package org.tureczki.projectmico.weblayer.servlet;

@WebServlet("/Investment")
public class InvestmentController extends HttpServlet{
	
	@EJB
	private InvestmentFacade facade;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
		ServletException, IOException{
		
		String investmentID = request.getParameter("investmentID");
		
		try{
			InvestmentStub investment = this.facade.getInvestment(investmentID);
			request.setAttribute("investment", investment);
		} catch(final FacadeException e){
			LOGGER.error(e, e);
		}
		RequestDispatcher view = request.getRequestDispatcher("investment.jsp");
		view.forward(request, response);
	}
	
}