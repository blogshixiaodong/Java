package com.Section_13;
import java.util.*;

public class UpperBoundTest {
	public static void main(String[] args) {
		List<Book2> bList = new ArrayList<Book2>();
		bList.add(new Book2("Java", 5));
		bList.add(new Book2("JSPS", 10));
		List<? extends Item> list = new ArrayList<Book2>(bList);
		Test2<Item> t = new Test2<Item>();
		t.printList(list);
		
		List<Item> iList = new LinkedList<Item>();
		
		iList.add(new Item("software"));
		iList.add(new Item("hardware"));
		
		t.printList(iList);
	}
}

class Item {
	protected String name;
	Item(String name) {
		this.name = name;
	}
	public String toString() {
		return "Name: " + name;
	}
}

class Book2 extends Item {
	private int quantity;
	public Book2(String name, int quantity) {
		super(name);
		this.quantity = quantity;
	}
	public String toString() {
		return super.toString() + "\nQuantity: " + quantity;
	}
}

class Test2 <T> {
	static <T> void printList(List<? extends T> c) {
		for(T item : c) {
			System.out.println(item);
		}
	}
}
