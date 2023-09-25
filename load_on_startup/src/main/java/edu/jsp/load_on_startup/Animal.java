package edu.jsp.load_on_startup;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Animal extends HttpServlet{

	static {
		System.out.println("animal is loaded");
	}
	
	public Animal() {
		System.out.println("Animal object created");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Animal is initialized");
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Working");
	}
	
}
