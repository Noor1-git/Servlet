package edu.jsp.RequestDispatcher.forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/bmiresult")
public class BmiResult extends HttpServlet{

	
			
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double height=(Double)req.getAttribute("height");
		double weight=(Double)req.getAttribute("weight");
		double value=(Double)req.getAttribute("value");
		String result="";
		
		if (value<18) {
			result="Under weight";
		} else if(value>=18 && value<=25){
			result="Normal";
		}else if(value>25 && value<=30) {
			result="Over Weight";
		}else {
			result="Obese";
		}
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.write(result);
		
	}
	
}
