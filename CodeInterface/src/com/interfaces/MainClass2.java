package com.interfaces;
import java.util.Scanner;
public class MainClass2 {
	
	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		Dress2 dress=new Dress2();
		System.out.println("Color = "+ dress.color);
		System.out.println("Type = "+ dress.type);
		System.out.println("What do you like to do? "+
							"\nPress 1 if you like to wear it"+
							"\nPress 2 if you don't like it"+
							"\nPress 3 if you like to buy a new one");
		int reply=console.nextInt();
		if(reply==1)
			dress.dressUp();
		else if(reply==2)
			dress.changeIt();
		else if(reply==3)
			dress.buyNew();
		else
			System.out.println("Bobo, invalid input");
	}
	
	}
