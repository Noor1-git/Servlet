package edu.jsp.load_on_startup;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ball extends HttpServlet{

	static {
		System.out.println("Ball is loaded");
	}
	
	public Ball() {
		System.out.println("Ball object created");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Ball is initialized");
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Working");
	}
	
}
