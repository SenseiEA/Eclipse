package com.features;

public class DaysInAWeek {
	enum Days{
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
	}
	public static void main (String[] args) {
		
		for (Days d:Days.values()) {
			switch(d) {
				case Monday: System.out.println("Monday - Moon");
				break;
				case Tuesday: System.out.println("Tuesday - Mars");
				break;
				case Wednesday: System.out.println("Wednesday - Mercury");
				break;
				case Thursday: System.out.println("Thursday - Jupiter");
				break;
				case Friday: System.out.println("Friday - Venus");
				break;
				case Saturday: System.out.println("Saturday - Saturn");
				break;
				case Sunday: System.out.println("Sunday - Sun");
				break;
			}
		}
	}
}
