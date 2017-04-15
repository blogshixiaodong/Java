package com.Section_13;

import java.util.LinkedList;

public class LinkTest {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.add(1);
		linkedList.add(2);
		System.out.println(linkedList);
		
		linkedList.add(3);
		System.out.println(linkedList);
		
		linkedList.addFirst(5);
		System.out.println(linkedList);
		
		linkedList.addLast(6);
		System.out.println(linkedList);
		
	}
}
