package edu.jsp.httpservlet.get;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Item extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter printWriter = resp.getWriter();
		try {

			String id = req.getParameter("id");
			String name = req.getParameter("name");
			double price = Double.valueOf(req.getParameter("price"));
			int qty = Integer.valueOf(req.getParameter("quantity"));
			String descripiton = req.getParameter("description");

			

			printWriter.print("<html><body><h1>Id : " + id + "</h1><h1>Name : " + name + "</h1><h1>Price : " + price
					+ "</h1><h1>Quantity : " + qty + "</h1><h1>Total Price : " + (price * qty)
					+ "</h1><h1>Description : " + descripiton + "</h1></body></html>");

		} catch (NumberFormatException e) {
			printWriter.print("price and quantity can only be numbers");
		} catch (Exception e) {
			printWriter.print("Something went wrong");
		}
	}
}