package com.Section_13;

import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {


	public static void main(String[] args) {
		TreeMap<String, String> emailMap = new TreeMap<String, String>();
		emailMap.put("1512974937@qq.com", "sxd");
		emailMap.put("1026548578@qq.com", "sxl");
		emailMap.put("1025@qq.com", "aaa");
		System.out.println(emailMap.firstKey());
		
		System.out.println(emailMap.lastKey());
		System.out.println(emailMap.lowerKey("1026548578@qq.com"));
		System.out.println(emailMap.higherKey("1026548578@qq.com"));
		System.out.println(emailMap.higherKey("1512974937@qq.com"));
		System.out.println();
		System.out.println(emailMap.lowerKey("1512974937@qq.com"));
		System.out.println(emailMap);
		
		TreeMap<String, String> treeMap = new TreeMap<String, String>(new CodeComparator());
		Set<String> set = emailMap.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			String value = emailMap.get(key);
			treeMap.put(key, value);
			System.out.println(key + " " + value);
		}
		System.out.println();
		System.out.println(emailMap);
		System.out.println(treeMap);
	}

}

class CodeComparator implements Comparator {
	public int compare(Object key1, Object key2) {
		int flag = key1.toString().compareTo(key2.toString());
		return -flag;
	}
}
