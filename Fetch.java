package com.te.savingemployee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Fetch extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = resp.getWriter();
		int num = Integer.parseInt((req.getParameter("number")));
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("employee");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		Employee details = createEntityManager.find(Employee.class, num);
		try {
		writer.print(details.getName());
		}catch(NullPointerException e) {
			writer.print("No data available");
		}
	}
}
