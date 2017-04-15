package com.Section_13;

import java.util.Collection;

public class Test <T>{
	public static void printList(Collection<?> c) {
		for(Object object : c) {
			System.out.println(object);
		}
	}
}
