package com.ty.firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GetUserInfo extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String phone =req.getParameter("Phone");
		String password=req.getParameter("password");
		
		System.out.println("Phone Number : "+phone);
		System.out.println("Password : "+password);
		PrintWriter printWriter=res.getWriter();
		printWriter.print("<html><body><h1>Sumbitted</h1></body></html>");
	}

}
