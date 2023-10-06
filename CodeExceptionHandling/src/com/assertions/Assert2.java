package com.assertions;

public class Assert2 {

	public static void main(String[] args) {
		int hour=Integer.parseInt(args[0]);
		int minute=Integer.parseInt(args[1]);
		
		assert (hour>=0&&hour<24):"Not a valid hour";
		assert (minute>=0&&minute<60):"Not a valid minute";
		
		System.out.println(hour+":"+minute);

	}

}
