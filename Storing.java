 package com.te.savingemployee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Storing extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		Cookie[] cookies = req.getCookies();
		String username = cookies[0].getValue();
		int id =  Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int salary = Integer.parseInt(req.getParameter("salary"));
		String designation = req.getParameter("designation");
		writer.print("<h1> Details Successfully added " + username  + "<h1>");
		Employee object = Employee.getObject();
		object.setId(id);
		object.setName(name);
		object.setDesignation(designation);
		object.setSalary(salary); 
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("employee");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction(); 
		transaction.begin();
		createEntityManager.persist(object);
		transaction.commit();
		writer.print("<a href='./home'> click here to add another details </a><br>");
		
		writer.print("<a href='./retrieve'> click here to get details </a>");
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
