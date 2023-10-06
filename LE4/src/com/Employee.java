package com;

public class Employee{
	String name;
	int rate;
    int hoursWorked;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public int grossPay(){
		int grossPay = rate * hoursWorked;
		return grossPay;
	}
       
    public String showDetails() {
    	return "Name: " + name + "\nRate: " + rate + "\nNumber of hours worked: " + hoursWorked;
    }
}