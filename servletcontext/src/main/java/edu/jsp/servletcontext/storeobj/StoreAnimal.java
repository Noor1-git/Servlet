package edu.jsp.servletcontext.storeobj;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/setAnimal")
public class StoreAnimal extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Animal animal=new Animal("cat", 1);
		ServletContext context=req.getServletContext();
		context.setAttribute("mycat", animal);
		System.out.println("Animal stored");
	}
	
}
