package com.input;

import java.io.*;

public class KeyboardInput {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Enter your salary:");
		float salary=Float.parseFloat(br.readLine());
		System.out.printf("Your salary is: %6.2f ", salary);
		
	}

}
