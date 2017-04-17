package com.Section_13;

public class GeneItems<T1, T2, T3> {
	private T1 firstObj;
	private T2 secondObj;
	private T3 thirdObj;
	
	//泛类型  实参化类型
	public GeneItems(T1 Obj1, T2 Obj2, T3 Obj3) {
		firstObj = Obj1;
		secondObj = Obj2;
		thirdObj = Obj3;
		
	}

	public T1 getFirstObj() {
		return firstObj;
	}

	public void setFirstObj(T1 firstObj) {
		this.firstObj = firstObj;
	}

	public T2 getSecondObj() {
		return secondObj;
	}

	public void setSecondObj(T2 secondObj) {
		this.secondObj = secondObj;
	}

	public T3 getThirdObj() {
		return thirdObj;
	}

	public void setThirdObj(T3 thirdObj) {
		this.thirdObj = thirdObj;
	}
	
	public static void main(String[] args) {
		GeneItems<String, Integer, Double> items = new GeneItems<String, Integer, Double>("Java", 21, 59.0);
		items.setSecondObj(20);
		System.out.println("Item name: " + items.getFirstObj() + " number: " + items.getSecondObj() + " price: " + items.getThirdObj());
	}
}
