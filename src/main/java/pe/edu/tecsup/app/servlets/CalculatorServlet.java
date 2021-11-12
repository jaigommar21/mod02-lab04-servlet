package pe.edu.tecsup.app.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String ope_1 = request.getParameter("ope_1");
		String ope_2 = request.getParameter("ope_2");

		// String to int
		int ope1 = Integer.parseInt(ope_1);
		int ope2 = Integer.parseInt(ope_2);
		
		
		// Sum
		System.out.println(ope1 + ope2);
		
		
//		response.getWriter()
//				.append("Served at: ")
//				.append(request.getContextPath());
		
		
		// Que recurso debo mostrar
		RequestDispatcher dispatcher 
			= getServletContext().getRequestDispatcher("/messages.html");
		
		
		// Hazlo
        dispatcher.forward(request, response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
