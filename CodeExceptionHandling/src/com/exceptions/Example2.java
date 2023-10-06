package com.exceptions;
import java.util.Scanner;
public class Example2 {
	public static void isBadTaste(boolean taste) throws BadFoodTasteException {
		if(taste)
			throw new BadFoodTasteException();
	}

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		try {
			System.out.print("No bitches? (Yes/No) ");
			char ans=console.next().toUpperCase().charAt(0);//yES,YES,yes,no,NO
			boolean reply;
			if(ans=='Y')
				reply=true;
			else
				reply=false;
			isBadTaste(reply);
			System.out.println("Heads up, KING.");
		}
		catch(BadFoodTasteException bfte) {
			System.out.println("L + ratio + u fell off + maidenless");
		}
	
	
}
}
