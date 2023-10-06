package com;
import java.util.*;
public class UsingQueue {

	public static void main(String[] args) {
		Deque<String> q=new ArrayDeque<>();
		q.add("sloth");
		q.add("zebra");
		q.add("snake");
		q.add("cat");
		q.add("dog");
		q.add("rabbit");
		q.add("bear");
		System.out.println("Head: "+q.peek());
		System.out.println("This element will be removed: "+q.remove());
		System.out.println("All the elements in the queue: ");
		Iterator iter=q.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
