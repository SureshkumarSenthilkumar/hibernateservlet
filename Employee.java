package com.te.savingemployee;

import javax.persistence.Entity; 
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private double salary;
	private String designation;
	@Transient
	static Employee e;
	
	
	
	public static Employee getObject() { 
		if  (e == null) {
			e = new Employee();
		}
		return e;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}

