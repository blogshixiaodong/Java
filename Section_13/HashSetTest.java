package com.Section_13;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		HashSet<String> hss = new HashSet<String>();
		hs.add("Hello");
		hs.add("World");
		hss.add("Hello");
		System.out.println(hs.addAll(hs));
		System.out.println(hs);
		
		hs.add("Java");
		System.out.println(hs.contains("World"));
		System.out.println(hs.remove("Hello"));
		System.out.println(hs);
		
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
		Object[] objects = hs.toArray();
		for(Object o : objects) {
			System.out.println(o);
		}
		
		objects = hs.toArray(hss.toArray());
		for(Object o : objects) {
			System.out.println(o);
		}
		System.out.println(hs.toString());
		
		Iterator<String> iterable = hs.iterator();
		while(iterable.hasNext()) {
			System.out.println(iterable.next());
		}
	}
}
