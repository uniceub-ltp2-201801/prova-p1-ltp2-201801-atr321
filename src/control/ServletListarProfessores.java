package control;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.Conexao;

import dao.ProfessorDAO;

import model.Professor;

/**
 * Servlet implementation class ServletListarProfessores
 */
@WebServlet("/listarProfessores")
public class ServletListarProfessores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletListarProfessores() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String nome = request.getParameter("nomeprofessor");
		System.out.println(nome);
		Connection conexao = Conexao.getConexao();
		//Professor p = (Professor)request.getAttribute("professor");
		int id = Integer.parseInt(request.getParameter("idprofessor"));
		//System.out.println(id);
		
		ProfessorDAO pd = new ProfessorDAO(conexao);
		
		//Professor p = pd.getProfessor(id);
		Professor p = pd.getProfessor(nome);
		
		//criar um atributo novo
		request.setAttribute("professor", p);
		
		//Repassar o request/response para o JSP
		RequestDispatcher rd = request.getRequestDispatcher("listarProfessores.jsp");
		 
		rd.forward(request, response);
		*/
		
		Connection conexao = Conexao.getConexao();
		ProfessorDAO cd = new ProfessorDAO(conexao);
		Professor p = (Professor)request.getAttribute("professor");
		
		//int id = request.getParameter("idprofessor");
		
		//System.out.println(c);
		//int id = Integer.parseInt(request.getParameter("idprofessor"));
		//int id = request.getParameter("id");
		
		

		ArrayList<Professor> professores = cd.getProfessor(p.getIdProfessor());
		
		System.out.println(p);
		System.out.println(professores);
		System.out.println(cd);
		//System.out.println(id);
		
		request.setAttribute("professores", professores);
		
		RequestDispatcher rd = request.getRequestDispatcher("listarProfessores.jsp");
		rd.forward(request, response);
	}

}
