package edu.jsp.load_on_startup;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cat",loadOnStartup = 3)
public class Cat extends HttpServlet {

	static {
		System.out.println("Cat is loaded");
	}
	
	public Cat() {
		System.out.println("Cat object created");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Cat is initialized");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Working");
	}
}