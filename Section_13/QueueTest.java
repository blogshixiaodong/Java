package com.Section_13;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest<E> {
	
	public void print(E item) {
		
	}
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		
		queue.add("sxd");
		queue.add("jjm");
		queue.add("oqj");
		queue.add("hhw");
		queue.add("cxl");
		
		System.out.println(queue);
		
		Queue<String> queue2 = new PriorityQueue<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int flag = o1.compareTo(o2);
				System.out.println(o1 + " " + o2 + " " + flag);
				return -flag;
			}
			
		});
		queue2.addAll(queue);
		System.out.println(queue2);
	}

}
