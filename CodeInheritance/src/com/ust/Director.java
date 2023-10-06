package com.ust;

public class Director extends Manager{
	private double carAllowance;

	public double getCarAllowance() {
		return carAllowance;
	}

	public void setCarAllowance(double carAllowance) {
		this.carAllowance = carAllowance;
	}
	
	public void increaseAllowance() {
		this.carAllowance +=200;
	}
	
	public String getDetails() {
		return super.getDetails() +", "+ carAllowance;
	}

}
