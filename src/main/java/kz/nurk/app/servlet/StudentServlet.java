package kz.nurk.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import kz.nurk.app.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//ArrayList<Students> list = StudentsList.getStudents();
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			out.println("<html>");
			out.println("<head>");
			out.println("<title> </title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>������ ���������</h1>");
			
			// ======
			out.println("<table border='1'>");
			out.println("<tr>");
				out.println("<td>");
					//out.print(s.getName());
				out.println("</td>");
				out.println("<td>Group</td>");
			out.println("</tr>");
			out.println("<body>");
			out.println("</html>");
		}finally {
			out.close();
		}
		
		service(request, response);
	}

}
