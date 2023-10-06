package com.per;

public class MyDate extends Person{
	private int day;
	private int month;
	private int year;
	
	public MyDate() {
		
	}
	public MyDate(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString() {
		return "Birthdate: " + this.day+"-"+this.month+"-"+this.year;
	}
	
	public boolean equals(Object obj) {
		if (obj==null) return false;
		if (!(obj instanceof MyDate)) return false;
		MyDate date=(MyDate)obj;
		return this.day==date.day && this.month==date.month && this.year==date.year;
	}

	public int hashCode() {
		return this.day^this.month^this.year;
	}
}
