package com.animal;
import com.interfaces.GoFly;
public class Bird extends Animal implements GoFly{
	public void eat() {
		System.out.println("Birds eat worms or grains...");
	}
	public void breathe() {
		System.out.println("Birds breathe...");
	}
	public void sleep() {
		System.out.println("Birds sleep...");
	}
	
	public void layEggs() {
		System.out.println("Birds lay eggs...");
	}
	public void buildNests() {
		System.out.println("Birds build nests...");
	}
	@Override
	public void flyHigh() {
		System.out.println("Birds fly high in the sky...");
		
	}
	@Override
	public void takeOff() {
		System.out.println("Birds flap their wings and take off...");
		
	}
	@Override
	public void fly() {
		System.out.println("Birds fly in the sky...");
		
	}
	@Override
	public void land() {
		System.out.println("Birds land on trees...");
		
	}
}
