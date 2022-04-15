package com.te.savingemployee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Home extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = resp.getWriter();
		Cookie[] cookies = req.getCookies();
		String username = cookies[0].getValue();
		writer.print("<h1> Hello " + username + "<h1>");
		writer.print("<form action=./storing method='post'" + "<h3> Enter your details </h3>" + "<h5>id</h5> "
				+ "<input type='number' name='id' placeholder='id'> <br>" + "<h5>name</h5> "
				+ "<input type='text' name='name' placeholder='name'> <br>" + "<h5>designation</h5> "
				+ "<input type='name' name='designation' placeholder='designation'> <br>" + "<h5>salary</h5> "
				+ "<input type='number' name='salary' placeholder='salary'> <br>"
				+ "<input type='submit' value='submit'>" + "</form>");

	}
}
