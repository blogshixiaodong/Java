package com.Section_13;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		ArrayList noSafeList = new ArrayList();	//无类型安全安保证
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<Double> priceList = new ArrayList<Double>(80);
		
		noSafeList.add('1');
		noSafeList.add(1);
		
		priceList.add(3.14); //自动装箱
		priceList.add(0, 2.17);
		System.out.println(priceList.size());
		System.out.println(priceList);
		priceList.clear();
		
		System.out.println(priceList.size());
		
		priceList.add(1.0);
		System.out.println(priceList.contains(1.00));
		
		priceList.remove(1.0);
		System.out.println(priceList.contains(1.00));
		
		priceList.add(1.0);
		System.out.println(priceList.contains(1.0));
		priceList.set(0, 2.0);
		System.out.println(priceList.contains(1.0));
		
		System.out.println(priceList.isEmpty());
		
		ArrayList<Double> doubles = new ArrayList<Double>();
		doubles.add(1.1);
		doubles.add(2.2);
		
		System.out.println(priceList);
		priceList.addAll(doubles);
		
		System.out.println(priceList);
		
		System.out.println(priceList.containsAll(doubles));
		
		priceList.remove(2.2);
		System.out.println(priceList.containsAll(doubles));
		
		System.out.println(priceList.toArray());
	
		
	}
}
