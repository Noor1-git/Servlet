package edu.jsp.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/recieve")
public class RecieveCookies extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie[] cookie = req.getCookies();

		if (cookie != null) {
			for (Cookie cookie2 : cookie) {

				System.out.println("Cookie name : " + cookie2.getName());
				System.out.println("Cookie value : " + cookie2.getValue());
				if (cookie2.getName().equalsIgnoreCase("Username")) {

//					Updating cookie max age to 1 day.
					cookie2.setMaxAge(1 * 24 * 60 * 60);
//					Updating cookie value from noor to Nooruddin.
					cookie2.setValue("Nooruddin");
//					After updating it must be added in the browser.
					resp.addCookie(cookie2);
					System.out.println("Updated");
				}
				System.out.println("------------------------------------------");
			}
		} else {
			System.out.println("Cookies not found");
		}
	}
}