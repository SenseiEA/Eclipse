package com.abstracts;

public class Dress1 extends AbstractDress{
	String type="casual";
	
	public Dress1() {
		super();
	}
	@Override
	public void dressUp() {
		System.out.println("I really like it!");
	}
	@Override
	public void changeIt() {
		System.out.println("I'd like to change it!");
	}
	
}
