package com.Section_13;


import java.sql.Connection;
import java.util.*;


import com.Section_22.Test;

public class WildcardTest {
	public static void main(String[] args) {
		//ÎÞ½çÍ¨Åä·û
		List<?> blist;
		List<Character> cList = new ArrayList<Character>();
		cList.add('a');
		List<Integer> iList = new ArrayList<Integer>();
		iList.add(8);
		iList.add(88);
		blist = new ArrayList<Integer>(iList);
		// blist.add('a'); Error
		
		
		List t = new ArrayList();
		t.add(5);
		t.add(3.14);
		Demo.printList(t);
		
		
		
	}
}

class Demo <T> {
	static void printList(Collection<?> c) {
		for(Object obj : c) {
			if(obj instanceof Integer) {
				System.out.println("Integer");
			} else if(obj instanceof Double) {
				System.out.println("Double");
			}
			System.out.println(obj);
		}
	}
}
