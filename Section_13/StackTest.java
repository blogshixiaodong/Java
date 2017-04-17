package com.Section_13;

import java.util.Iterator;
import java.util.Stack;

public class StackTest {

	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		int pos = stack.search("b");
		System.out.println(pos);
		
		System.out.println(stack);
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		Iterator<String> iterator = stack.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(stack.get(1));
	
		
	}

}
