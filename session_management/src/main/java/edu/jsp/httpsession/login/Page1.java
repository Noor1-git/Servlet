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

@WebServlet(value = "/page1")
public class Page1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		PrintWriter writer = resp.getWriter();

		String name = (String) session.getAttribute("name");
		String pass = (String) session.getAttribute("pass");

		if (name!=null && pass!=null) {
			writer.write("<h1>Page 1 Content accessed</h1>");
		} else {
			writer.write("<h1>Please Login</h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}
	}
}
