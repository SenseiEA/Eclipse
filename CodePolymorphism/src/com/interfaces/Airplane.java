package com.interfaces;

public class Airplane implements GoFly{

	@Override
	public void takeOff() {
		System.out.println("Planes take off");
	}

	@Override
	public void fly() {
		System.out.println("Planes fly in the sky");
	}

	@Override
	public void land() {
		System.out.println("Planes land on the runway");
	}
	@Override
	public void flyHigh() {
		System.out.println("Planes fly high in the sky");
	}

}
