package com.features;
public class WrapperClass {
	public static void main(String[] args) {
		int num=100;
		Integer i=new Integer(num);//autoboxing
		Integer j=new Integer(200);//autoboxing
		Integer k=new Integer("123");
		int num2=j.intValue();//autounboxing
		
		System.out.println("i= "+i.intValue());
		System.out.println("j= "+j.intValue());
		System.out.println("k= "+k);
		System.out.println("sum= "+(i+j+k));
		System.out.println("num2= "+num2);
		
	}

}
