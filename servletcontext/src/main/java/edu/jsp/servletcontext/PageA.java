package edu.jsp.servletcontext;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/apple")
public class PageA extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		ServletContext context=getServletContext();  1st way
//		ServletContext context=req.getServletContext();   2nd way
		
//		3rd way
		ServletConfig config=getServletConfig();
		ServletContext context=config.getServletContext();
		
		String name=context.getInitParameter("name");
		String url=context.getInitParameter("url");
		System.out.println(name);
		System.out.println(url);
		
//		String threadName=Thread.currentThread().getName();
//		System.out.println("Name : "+threadName);
	}
}