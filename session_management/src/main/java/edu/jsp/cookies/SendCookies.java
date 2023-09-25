package edu.jsp.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/send")
public class SendCookies extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie=new Cookie("Username", "noor");
		Cookie cookie2=new Cookie("password", "123456");
		
		resp.addCookie(cookie);
		resp.addCookie(cookie2);
		
		resp.getWriter().write("<h1>Cookies created and added on response</h1>");
	}
}