package com.exceptions;

@SuppressWarnings("serial")
public class UserDefinedException extends Exception{
	String msg;
	
	public UserDefinedException(String msg) {
		this.msg=msg;
	}
	public String toString() {
		return "Exception occured: "+this.msg;
	}
}
