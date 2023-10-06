package com.abstracts;
import java.util.Scanner;
public class MainClass1 {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		
		Dress1 dress=new Dress1();
		System.out.println("Color = "+ dress.color);
		System.out.println("Type = "+ dress.type);
		System.out.println("What do you like to do? "+
							"\nPress 1 if you like to wear it"+
							"\nPress 2 if you don't like it");
		int reply=console.nextInt();
		if(reply==1)
			dress.dressUp();
		else if(reply==2)
			dress.changeIt();
		else
			System.out.println("Bobo, invalid input");
	}
	
	

}
