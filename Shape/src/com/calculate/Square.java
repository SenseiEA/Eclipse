package com.calculate;

public class Square implements Shape{
	int side;
	
	public Square() {
		
	}
	
	public Square(int side) {
		this.side=side;
	}

	@Override
	public double getPerimeter() {
		return (4*side);
	}

	@Override
	public double getArea() {
		return (Math.pow((side), 2));
	}

	@Override
	public void getDetails() {
		System.out.println("Type: Square"+ "\nSide: "+ this.side+ "\nPerimeter: "+ 
				this.getPerimeter()+ "\nArea: "+ String.format("%.1f",this.getArea()));
	}
}
