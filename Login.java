package com.te.savingemployee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = resp.getWriter();
		writer.print("<h1> Login  <h1>");
		writer.print("<form action='./service' method='post'" + "<h2>Username</h2>"
				+ "<input type='text' name='username' placeholder='username'> <br>" + "<h2>Email ID</h2>"
				+ "<input type='email' name='email' placeholder='mail id'> <br>" + "<h2>Password</h2> "
				+ "<input type='password' name='password' placeholder='password'> <br>"
				+ "<input type='submit' value='Submit'" + "</form>");
	}
}
