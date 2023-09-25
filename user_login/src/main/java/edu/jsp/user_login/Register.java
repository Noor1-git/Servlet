package edu.jsp.user_login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/register")
public class Register extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		DAO dao=new DAO();
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		User user=new User(name, email, pass);
		
		PrintWriter writer=resp.getWriter();
		
		if (dao.register(user)) {
			writer.print("<html><body><h3>Registered...Please login to proceed...</h3></body></html>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		} else {
			writer.print("<h3>Registration failed</h3>");
		}
		
	}
}
