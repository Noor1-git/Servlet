package edu.jsp.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/pageb1")
public class PageB extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();

		String user = (String) session.getAttribute("User");

		PrintWriter writer = resp.getWriter();

		writer.write("<h1>User name is : " + user + "</h1>");

		Student student = new Student("Vikas", 101, 10);

		session.setAttribute("my_student", student);

		writer.write("<h1>Student added to Session</h1>");

	}
}
