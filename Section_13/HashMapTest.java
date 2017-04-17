package com.Section_13;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap hashMap = new HashMap(10);
		HashMap<String, String> phoneBook = new HashMap<String, String>();
		
		phoneBook.put("oqj", "3151911207");
		phoneBook.put("sxd", "3151911208");
		phoneBook.put("cxl", "3151911209");
		phoneBook.put("hhw", "3151911210");
		phoneBook.put("jjm", "3151911211");
		phoneBook.put("hcy", "3151911212");
		
		System.out.println(phoneBook.put("xxx", "3151911213"));
		System.out.println(phoneBook);
		
		phoneBook.remove("xxx");
		System.out.println(phoneBook);
		
		System.out.println(phoneBook.isEmpty());
		
		System.out.println(phoneBook.size());
		
		System.out.println(phoneBook.containsKey("sxd"));
		System.out.println(phoneBook.containsValue("3151911213"));
		
		Set<String> hashSet = phoneBook.keySet();
		Iterator<String> iterator = hashSet.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		Collection<String> collection = phoneBook.values();
		iterator = collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(phoneBook.get("sxd"));

	}

}
