package com.calculate;

public class Rectangle implements Shape{
	int length;
	int width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int length, int width) {
		this.length=length;
		this.width=width;
	}
	@Override
	public double getPerimeter() {
		return (2*(length+width));
	}
	@Override
	public double getArea() {
		return (length*width);
	}
	@Override
	public void getDetails() {
		System.out.println("Type: Rectangle"+ "\nLength: "+ Math.max(width, length)+
							"\nWidth: "+ Math.min(width, length)+ "\nPerimeter: "+ 
				this.getPerimeter()+ "\nArea: "+ String.format("%.1f",this.getArea()));
	}
}
