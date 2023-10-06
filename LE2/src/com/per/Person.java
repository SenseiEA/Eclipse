package com.per;

public class Person{
	private String name;
	private MyDate dob;
	
	public Person() {
		
	}
	
	public Person(String name, MyDate dob) {
		setName(name);
		setDob(dob);
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getDob() {
		return dob;
	}

	public void setDob(MyDate dob) {
		this.dob = dob;
	}

	public int hashCode() {
		return this.name.hashCode()^this.dob.hashCode();
	}
	
	public boolean equals(Object obj) {
		if (obj==null) 
			return false;
		if(!(obj instanceof Person)) 
			return false;
		Person p2=(Person)obj;
		return this.name.equals(p2.name)&&this.dob.equals(p2.dob);
			
	}

	public String toString() {
		return "Name: "+ this.name+"\n"+this.dob;
	}
	
}
