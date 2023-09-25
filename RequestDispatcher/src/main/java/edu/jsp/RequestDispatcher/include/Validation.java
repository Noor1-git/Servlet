package edu.jsp.RequestDispatcher.include;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/validate")
public class Validation extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
		PrintWriter printWriter=resp.getWriter();
		
		
		String name=req.getParameter("user_name");
		String password=req.getParameter("user_password");
		
		if (name.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			printWriter.print("<h1>Login Successful</h1>");
		} else {
			printWriter.print("<h1>Invalid credentials</h1>");
			dispatcher.include(req, resp);
		}
	}
}