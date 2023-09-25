package com.jsp.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterByPost extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("password");

		PrintWriter printWriter = resp.getWriter();

		printWriter.print("<html><body><h1>Name : " + name + "</h1>\n<h1>Email : " + email + "</h1>\n<h1>Password : "
				+ pass + "</h1></body></html>");
	}
	
}
