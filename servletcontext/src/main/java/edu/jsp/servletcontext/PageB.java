package edu.jsp.servletcontext;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/bat")
public class PageB extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		1st way
//		ServletContext context=getServletContext();  
//		2nd way
//		ServletContext context=req.getServletContext();   
		
//		3rd way
		ServletConfig config=getServletConfig();
		ServletContext context=config.getServletContext();
		
		String name=context.getInitParameter("name");
		String url=context.getInitParameter("url");
		System.out.println(name);
		System.out.println(url);
	}
}