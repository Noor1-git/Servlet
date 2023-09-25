package edu.jsp.servletcontext.storeobj;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/getAnimal")
public class GetAnimal extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext context = req.getServletContext();
		Object object = context.getAttribute("mycat");
		if (object != null) {
			Animal animal = (Animal) object;
			System.out.println("Animal name is : " + animal.getName());
			System.out.println("Animal age is : " + animal.getAge());
		} else {
			System.out.println("Animal not found");
		}
	}
}