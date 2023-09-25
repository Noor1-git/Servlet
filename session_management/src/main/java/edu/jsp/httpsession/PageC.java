package edu.jsp.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/pagec1")
public class PageC extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();

		String user = (String) session.getAttribute("User");

		PrintWriter writer = resp.getWriter();

		Student student = (Student) session.getAttribute("my_student");

		writer.write("<h1>User name is : " + user + "</h1>");

		writer.write("<h1>Student Name : " + student.getName() + "</h1>\n<h1>Student id : " + student.getId()
				+ "</h1>\n<h1>Student Age : " + student.getAge() + "</h1>");

	}

}
