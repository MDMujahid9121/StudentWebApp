package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDAO;
import com.model.Student;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");		
		PrintWriter out = response.getWriter();

		String emailId = request.getParameter("emailId");
		String password = request.getParameter("password");
		System.out.println("emailid:"+emailId);

		out.print("<html>");
		if (emailId.equalsIgnoreCase("admin") && password.equals("admin")) {

			RequestDispatcher rd = request.getRequestDispatcher("AdminPage");
			rd.forward(request, response);

		} else {

			StudentDAO stDAO = new StudentDAO();
			Student st = stDAO.stLogin(emailId, password);

			if (st != null) {
				RequestDispatcher rd = request.getRequestDispatcher("StudentHomePage");
				rd. forward(request, response);
			} else {

				out.print("<body bgcolor=lightyellow text=red>");
				out.print("<center>");
				out.print("<h1>Invalid Credentials</h1>");

				RequestDispatcher rd = request.getRequestDispatcher("SttLogin.html");
				rd.include(request, response);
			}
		}
		out.print("</center></body></html>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
