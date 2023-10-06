package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.ust.Director;
import com.ust.Employee;
import com.ust.Engineer;
import com.ust.Manager;
import com.ust.Secretary;

public class TestInheritance {
	public static void main(String[] args) throws ParseException {
		String[] names= {"Noel","Dana","Faith"};
		double[] salaries= {10000.90,25000.89,78800.90};
		String[] dept= {"Accounting","IT"};
		double[] allowance= {10000.00};

		Employee[] staff=new Employee[3];
		staff[0]=new Engineer();
		staff[1]=new Manager();
		staff[2]=new Director();
		
		for(int i=0;i<staff.length;i++) {
			staff[i].setName(names[i]);
			staff[i].setSalary(salaries[i]);
			
			if(staff[i] instanceof Manager) {
			((Manager) staff[i]).setDepartment(dept[i-1]);
				if(staff[i] instanceof Director) {
				((Director) staff[i]).setCarAllowance(allowance[i-2]);
			}
			}
			
			
			System.out.println(staff[i].getDetails());
		}
			
		

	}

}
