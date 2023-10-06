package com.features;

public class UsingEnum {
	enum Reply{
		YES, NO, MAYBE;
	}
		//enum having a set of constants
	public static void main(String[] args) {
		
		for(Reply r:Reply.values()) {
			switch(r) {
				case YES:System.out.println("OO");break;
				case NO: System.out.println("HINDI");break;
				case MAYBE: System.out.println("BAKA");break;
				}

			}
	}
}//data abstraction can be achieved through abstract class and interfaces
