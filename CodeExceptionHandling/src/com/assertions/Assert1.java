package com.assertions;

import java.util.Scanner;

public class Assert1 {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age=console.nextInt();
		
		assert age>=18:"Not a voter yet";
		System.out.println("Your age is: "+age);

	}

}
