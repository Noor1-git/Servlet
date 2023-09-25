package edu.jsp.user_login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/login")
public class Login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		DAO dao=new DAO();
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		PrintWriter writer=resp.getWriter();
		
		User user=new User(email, pass);
		
		if (dao.login(user)) {
			writer.print("<h1>Login successful</h1>");
		} else {
			writer.print("Login Failed please try again");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}
	}
}