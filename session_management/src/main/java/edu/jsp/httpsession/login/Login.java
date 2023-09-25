package edu.jsp.httpsession.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value="/login")
public class Login extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("user");
		String pass=req.getParameter("pass");
		PrintWriter writer=resp.getWriter();
		
		if (name.equals("admin") && pass.equals("admin")) {
			HttpSession session=req.getSession();
			session.setAttribute("name", name);
			session.setAttribute("pass", pass);
			writer.write("<h1>Login Success</h1>");
		} else {
			writer.write("<h1>Login Failed</h1>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}
		
		
	}
}
