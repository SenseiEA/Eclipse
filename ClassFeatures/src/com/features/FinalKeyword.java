package com.features;
public class FinalKeyword {
	public final double TAX_RATE;
	//final cannot be changed
	public FinalKeyword() {
		TAX_RATE=.3;
	}
	public final void computeTax(double amt) {
		double tax=amt*TAX_RATE;
		System.out.println("Tax= "+tax);
	}
	public static void main(String[] args) {
		FinalKeyword f=new FinalKeyword();
		f.computeTax(1000.00);

	}

}
