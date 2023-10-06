package com.obj;

public class Student {
	private int sNo;
	private String firstName;
	private String middleName;
	private String lastName;
	
	
	public Student() {
		
	}
	public Student(int sNo,String firstName,String middleName,String lastName) {
		setsNo(sNo);
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
	}
	public Student(int sNo,String firstName,String lastName) {
		setsNo(sNo);
		setFirstName(firstName);
		setLastName(lastName);
	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString() {
		return this.sNo+", "+ this.firstName+", " +this.middleName+", "+ this.lastName;
	}
	
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(!(obj instanceof Student)) return false;
		Student s4=(Student)obj;
		return this.sNo==s4.sNo&&this.lastName.equals(s4.lastName)&&
				this.firstName.equals(s4.firstName)&&
				this.middleName.equals(s4.middleName);
		
		
	}
	public int hashCode() {
		return this.sNo^this.firstName.hashCode()^this.middleName.hashCode()^
				this.lastName.hashCode();
	}
	
	
	
	
	
}
