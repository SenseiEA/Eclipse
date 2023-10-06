package com.calculate;

public class Circle implements Shape{
	final float PI = (float) 3.14;
	int radius;
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double getPerimeter() {
		return (2*PI*radius);
	}
	@Override
	public double getArea() {
		return (PI*(Math.pow(radius, 2)));
	}
	@Override
	public void getDetails() {
		System.out.println("Type: Circle"+ "\nRadius: "+ this.radius+ "\nPerimeter: "+ 
							String.format("%.1f", getPerimeter())+ "\nArea: "+ String.format("%.1f", getArea()));
		
	}
}
