package com.ust;

import java.util.Date;

public class Employee {
	private String name;
	private double salary;
	private Date birthdate;
	
	//setters = mutator methods
	//getters = accessor methods
	

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

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getDetails() {
		return this.name +", "+this.salary+", "+this.birthdate;
		
	}
}
