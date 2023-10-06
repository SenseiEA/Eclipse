package com.absint;

public class ClassC extends AbstractB{
	@Override
	public void a() {
		System.out.println("Method a()...");	
	}
	@Override
	public void b() {
		System.out.println("Method b()...");	
	}
	@Override
	public void c() {
		System.out.println("Method c()...");	
	}
	@Override
	public void d() {
		System.out.println("Method d()---> abstract method from AbstractB");
		
	}
	
}
