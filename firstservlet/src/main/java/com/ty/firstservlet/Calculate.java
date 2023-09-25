package com.ty.firstservlet;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Calculate extends GenericServlet {

	static boolean loop = true;
	static Scanner scanner = new Scanner(System.in);
	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		try {
			double number1 = Double.valueOf(req.getParameter("number_1"));
			double number2 = Double.valueOf(req.getParameter("number_2"));
			do {
				System.out.println("Enter operation to perform\n" + "1.Addition\n" + "2.Subtraction\n"
						+ "3.Multiplication\n" + "4.Division\n" + "5.Exit\n");
				int choice = scanner.nextInt();
				scanner.nextLine();

				switch (choice) {
				case 1: {
					System.out.println(add(number1, number2));
					break;
				}
				case 2: {
					System.out.println(sub(number1, number2));
					break;
				}
				case 3: {
					System.out.println(mul(number1, number2));
					break;
				}
				case 4: {
					System.out.println(div(number1, number2));
					break;
				}
				case 5: {
					System.out.println("Thank you...");
					loop = false;
					break;
				}
				default: {
					System.out.println("Invalid choice Please try again\n");
				}
					break;
				}
			} while (loop);
		} catch (NumberFormatException e) {
			System.out.println("Not a number");
		}

	}

	public static double add(double a, double b) {
		return (a + b);
	}

	public static double sub(double a, double b) {
		return (a - b);
	}

	public static double div(double a, double b) {
		if (b != 0) {
			return (a / b);
		} else {
			return 0;
		}

	}

	public static double mul(double a, double b) {
		return (a * b);
	}

}
