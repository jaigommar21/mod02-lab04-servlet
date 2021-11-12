package pe.edu.tecsup.app.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request    /* recibe la peticion   */ , 
						 HttpServletResponse response  /* responde la peticion */ ) 
				throws ServletException, IOException {
		
		//     http://localhost:8080/mod02-lab04-servlet/
		//     
		//     RegisterServlet?username=jgomezm
		//
		// 
		
		String username = request.getParameter("username");
		
		System.out.println(username);
		
		response.getWriter()
							.append("<html>")
							.append("<h2>Hola " + username + " </h2>")
							.append("<p>Este es mi primer Servlet</p>")
							.append("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
