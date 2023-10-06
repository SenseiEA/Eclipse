package com.ust;

public class Manager extends Employee{
	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDetails() {
		return super.getDetails()+ ", "+ department;
	}
}
