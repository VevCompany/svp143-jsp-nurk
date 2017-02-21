package kz.nurk.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kz.nurk.model.Student;
import kz.nurk.model.StudentDAO;

/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

/*	*//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
*/
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/success.jsp");
		
		System.out.println("Method type = " + request.getMethod());
		String name = ( request.getParameter("name") != null && !request.getParameter("name").isEmpty()) ? request.getParameter("name") : "";
		boolean newStud = (request.getParameter("new") != null && !request.getParameter("new").isEmpty()) ? true : false;
		System.out.println("Parameter name = " + name);
		
		
		
		/*if(newStud) {
			//newStudent();
		}*/
		
		ArrayList<Student> students = StudentDAO.getStudent();
		
		request.setAttribute("title", "Students list");
		request.setAttribute("students", students);
		
		
		rd.forward(request, response);
	}

}
