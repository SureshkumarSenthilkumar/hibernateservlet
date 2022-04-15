package com.te.savingemployee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Service extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = resp.getWriter();
		writer.print("<a href=./home> click here for storing </a> <br>");
		writer.print("<a href=./retrieve> click here for retrieving </a>");
		String name = req.getParameter("username");
		Cookie cookie = new Cookie("username", name);
		resp.addCookie(cookie);

	}
}
