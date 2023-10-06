package com.animal;

public class Mammal extends Animal{
	public void eat() {
		System.out.println("Mammals eat meat or plants...");
	}
	public void breathe() {
		System.out.println("Mammals breathe...");
	}
	public void sleep() {
		System.out.println("Mammals sleep...");
	}
	
	public void feedYoung() {
		System.out.println("Mammals drink milk when young...");
	}
}
