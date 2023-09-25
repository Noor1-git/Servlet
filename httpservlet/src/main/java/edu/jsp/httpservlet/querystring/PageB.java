package edu.jsp.httpservlet.querystring;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/page-b")
public class PageB extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter=resp.getWriter();
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String height=req.getParameter("height");
		String pass=req.getParameter("pass");
		
		printWriter.print("<h1>"+id+"</h1>");
		printWriter.print("<h1>"+name+"</h1>");
		printWriter.print("<h1>"+height+"</h1>");
		printWriter.print("<h1>"+pass+"</h1>");
	}
}