package com.exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		try {
			System.out.println("Enter two integers: ");
			int num1=console.nextInt();
			int num2=console.nextInt();
			int quotient=num1/num2;
			System.out.println("Quotient is: "+ quotient);
			double[] arr=new double[7];
			arr[7]=90.67;
			System.out.println("arr[7]="+ arr[7]);
			
			Integer x=new Integer("123");
			System.out.println("x="+x);
		}
		catch(InputMismatchException ime) {
			System.out.println("Can only accept whole numbers");
		}
		catch(Exception e) {
			System.out.println("Exception occurred: "+e.getMessage());
		}
		/*catch(ArithmeticException ae) {
			System.out.println("Cannot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException aoe) {
			System.out.println("It is not a valid index");
		}
		catch(NumberFormatException nfe) {
			System.out.println("Cannot put characters in wrapper class");
		}*/
		finally {
			System.out.println("Thank you for using the program");
		}
	}
}
