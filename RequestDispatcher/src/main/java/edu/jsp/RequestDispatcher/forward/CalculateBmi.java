package edu.jsp.RequestDispatcher.forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/calculate")
public class CalculateBmi extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double height=Double.valueOf(req.getParameter("height"));
		double weight=Double.valueOf(req.getParameter("weight"));
		
		double value=weight/(height*height);
		
		req.setAttribute("value", value);
		req.setAttribute("height", height);
		req.setAttribute("weight", weight);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("bmiresult");
		dispatcher.forward(req, resp);
	}
}