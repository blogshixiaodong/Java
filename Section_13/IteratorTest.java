package com.Section_13;


import java.util.*;

public class IteratorTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("C");
		list.add("C++");
		list.add("Java");
		list.add("C#");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
	}
}
