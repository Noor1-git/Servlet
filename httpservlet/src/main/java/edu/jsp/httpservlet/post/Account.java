package edu.jsp.httpservlet.post;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Account extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter = resp.getWriter();
		try {

			int account_no = Integer.valueOf(req.getParameter("acc_no"));
			double bal = Double.valueOf(req.getParameter("bal"));
			double amount = Double.valueOf(req.getParameter("amount"));

			if (bal >= amount) {
				printWriter.print("<html><body><h1>Account Number : " + account_no + "</h1><h1>Balance : " + bal
						+ "</h1><h1>Amount : " + amount + "</h1><h1>Current Balance : " + (bal - amount)
						+ "</h1></body></html>");
			} else {
				printWriter.print("Insufficient Balance");
			}

		} catch (NumberFormatException e) {
			printWriter.print("price and quantity can only be numbers");
		} catch (Exception e) {
			printWriter.print("Something went wrong");
		}
	}
}