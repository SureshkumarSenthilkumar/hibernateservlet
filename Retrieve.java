package com.te.savingemployee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Retrieve extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = resp.getWriter();
		writer.print("enter the employee id to fetch");
		writer.print("<form action=./fetch method='post'>" + "<input type='number' name='number'"
				+ "<input type='submit' value='submit'" + "</form>");
	}
}
