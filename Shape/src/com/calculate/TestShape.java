package com.calculate;

public class TestShape {

	public static void main(String[] args) {
		Shape shape;
		if (args.length==1) {
			shape=new Circle(Integer.parseInt(args[0]));
		}
		//Square and Rectangle
		else if(args.length==2) {
			int s1= Integer.parseInt(args[0]);
			int s2= Integer.parseInt(args[1]);
			if (s1==s2)
				shape=new Square(s1);
			else
				shape=new Rectangle(s1,s2);
		}
		//Triangle
		else if(args.length==3) {
			shape=new Triangle(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		}
		else {
			System.out.println("Invalid Input");
			return;
		}
		shape.getDetails();
	}

}
