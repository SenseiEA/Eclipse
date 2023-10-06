package com.test;
import com.per.*;
import java.util.Scanner;
public class TestPerson {


	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		Person p1=new Person();
		System.out.println("Enter name:   ");
		String sub1=console.next();
		p1.setName(sub1);
		
		
		System.out.println("Enter birthdate (Day-Month-Year): ");
		String bdate1=console.next();
		String[] born1= bdate1.split("-", 3);
		int[] dates1=new int[born1.length];
		
		for(int i=0;i<dates1.length;i++)
		dates1[i]=Integer.parseInt(born1[i]);
		MyDate myDate1=new MyDate(dates1[0],dates1[1],dates1[2]);
		p1.setDob(myDate1);
		
		System.out.println("\n ");
		
		Person p2=new Person();
		System.out.println("Enter name:   ");
		String sub2=console.next();
		p2.setName(sub2);
		
		
		System.out.println("Enter birthdate (Day-Month-Year): ");
		String bdate2=console.next();
		String[] born2= bdate2.split("-", 3);
		int[] dates2=new int[born2.length];
		
		for(int i=0;i<dates2.length;i++)
		dates2[i]=Integer.parseInt(born2[i]);
		MyDate myDate2=new MyDate(dates2[0],dates2[1],dates2[2]);
		p2.setDob(myDate2);
		
		System.out.println("\n ");
		
		if(p1.equals(p2)&&myDate1.equals(myDate2)){
			System.out.println("IDENTICAL");
		}
		else
			System.out.println("NOT IDENTICAL");
		
		System.out.println("Name 1: "+sub1);
		System.out.println("Birthdate: "+myDate1);
		System.out.println("Name 2: "+sub2);
		System.out.println("Birthdate: "+myDate2);
	}

}

