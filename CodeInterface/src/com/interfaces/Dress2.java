package com.interfaces;

public class Dress2 implements InterfaceDress, InterfaceDress2{
	@Override
	public void dressUp() {
		System.out.println("I really like it!");
	}
	@Override
	public void changeIt() {
		System.out.println("I'd like to change it!");
	}
	@Override
	public void buyNew() {
		System.out.println("I'd like to buy a new dress.");
		
	}
	
}
