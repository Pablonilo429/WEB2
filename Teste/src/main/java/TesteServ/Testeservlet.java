package TesteServ;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Servlet implementation class Testeservlet
 */
public class Testeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Testeservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		String[] preferencias = request.getParameterValues("preferencias");
		 for (int i = 0; i < preferencias.length; i++) {
			 System.out.println(Arrays.toString(preferencias));
		 }
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>" +nome + "</h1>"+ "<h2>" + idade + "</h2>" + "<h3>" + 
		Arrays.toString(preferencias).replace("[", "").replace("]", "") + "</h3>");
		
	}

}
