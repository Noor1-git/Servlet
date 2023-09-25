package com.ty.firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UserInfo extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String username=req.getParameter("user_name");
		String email=req.getParameter("user_email");
		String age=req.getParameter("user_age");
		
		System.out.println("Username is : "+username);
		System.out.println("Email is : "+email);
		System.out.println("Age is : "+age);
		
		PrintWriter printWriter=res.getWriter();
		printWriter.print("<html><body><h1>Registered</h1></body></html>");
	}
}




