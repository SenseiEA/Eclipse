package com.exceptions;
public class Example1 {
	public static void main(String[] args) {
		try {
			System.out.println("Start of try block.");
			throw new UserDefinedException("This is my error message.");
		}
		catch(UserDefinedException ude) {
			System.out.println("Catch block.");
			System.out.println(ude);
		}

	}
}
