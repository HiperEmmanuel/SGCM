package Servlet;
import conectorBD.Consulta;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conectorBD.Consulta;

/**
 * Servlet implementation class Registro
 */
@WebServlet("/Registro")
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		String name = request.getParameter("name");
		String lastname = request.getParameter("lastname");
		String academy = request.getParameter("academy");
		String date = request.getParameter("birddate");
		String sex = request.getParameter("sex");
		//Date date = df.parse(fecha);
		
		
		
		Consulta co = new Consulta();
		
		if (co.registrar(email, password, name, lastname, academy, date, sex)) {
			response.sendRedirect("perfil.jsp");
		} else {
			response.sendRedirect("login.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
