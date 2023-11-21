package com.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StRegisterServlet")
public class StRegisterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studentName = request.getParameter("studentName");
		int age  =Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String emailId=request.getParameter("emailId");
		String password = request.getParameter("password");
		System.out.println(studentName+" "+age+" "+gender + " "+emailId + " " + password);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
