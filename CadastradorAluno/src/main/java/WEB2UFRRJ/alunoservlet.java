package WEB2UFRRJ;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Servlet implementation class alunoservlet
 */
public class alunoservlet extends HttpServlet {
	private static ArrayList<Aluno> turma = new ArrayList<Aluno>();//Necessario para o objeto ser adicionado sem substituir outro
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public alunoservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		
		String nome;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		nome = request.getParameter("nome");
		
		if(request.getParameter("opcoes").equals("nome")){ 
			for(int i = 0; i < turma.size(); i++) {
				if(nome.equals(turma.get(i).nome)) {
					out.println("<h1> Aluno: </h1><br><br>" + "<a>Matricula: " + turma.get(i).getMatricula() + "</a><br>"
					+"<a>Nome: " + turma.get(i).getNome() + "</a>");
				}
				
			}
							
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		Aluno aluno = new Aluno();
		aluno.setMatricula(request.getParameter("matricula"));
		aluno.setNome(request.getParameter("nome"));
		turma.add(aluno);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		for(int i = 0; i < turma.size(); i++) {
            out.println("<p>"+turma.get(i).getNome()+"</p>");
        }
		
	}

}
