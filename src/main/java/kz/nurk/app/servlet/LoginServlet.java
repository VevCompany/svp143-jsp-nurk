package kz.nurk.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kz.nurk.model.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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

	private static final long serialVersionUID1 = 2116983427258983213L;
	
	private static final String PAGE_SUCCESS = "success";
	private static final String PAGE_ERROR = "error";
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("title", "Welcome");
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		
		if (login != null && password != null) {
			
			User user = new User(login, password);
			if(user.authValidate()) {
				rd = request.getRequestDispatcher("/jsp/success.jsp");
				/*request.setAttribute("title", "Main page");
				request.setAttribute("user", user);*/
			}else {
				request.setAttribute("error", "Invlid login OR page");
				//rd = request.getRequestDispatcher(PAGE_ERROR);
			}
		}
		
		rd.forward(request, response);
		
		//service(request, response);
	}

}
