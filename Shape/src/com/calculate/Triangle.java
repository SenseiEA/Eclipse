package com.calculate;

public class Triangle implements Shape{
	int sideA;
	int sideB;
	int sideC;
	
	public Triangle() {
		
	}
	
	public Triangle(int sideA, int sideB, int sideC) {
		this.sideA=sideA;
		this.sideB=sideB;
		this.sideC=sideC;
	}

	@Override
	public double getPerimeter() {
		return (sideA+sideB+sideC);
	}

	@Override
	public double getArea() {
		float s =((sideA+sideB+sideC)/(float)2);
		return (Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC)));
	}

	@Override
	public void getDetails() {
		System.out.println("Type : Triangle" +"\nSides: "+ this.sideA+", "+ this.sideB+", "+ this.sideC+
				"\nPerimeter: "+ this.getPerimeter()+
				"\nArea: "+ String.format("%.1f", this.getArea()));
	}
	
}
