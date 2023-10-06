package com;
import java.util.*;
public class UsingMap {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(8, "Monkey");
		map.put(3,"Giraffe");
		map.put(1, "Zebra");
		map.put(7, "Bear");
		map.put(2, "Rabbit");
		map.put(5, "Cat");
		map.put(8, "Dog");
		
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		/*for(Map.Entry m:map.entrySet())
			System.out.println(m.getKey()+" - "+m.getValue());
			 */
	}

}
