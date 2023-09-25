package edu.jsp.HttpServletResponse.sendRedirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/loan_info")
public class LoanInfo extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String type = req.getParameter("loan-type");
		PrintWriter writer = resp.getWriter();

		if (type.equalsIgnoreCase("Home")) {
			
			writer.print("<h1>Home laon Info</h1>");
			
		} else if (type.equalsIgnoreCase("Personal")) {
			
			writer.print("<h1>Personal laon Info</h1>");
			
		} else if (type.equalsIgnoreCase("Car")) {
			
			writer.print("<h1>Car laon Info</h1>");
			
		} else {
			resp.sendRedirect("https://www.google.com");
		}
	}

}
