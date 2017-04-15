package com.Section_13;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMapTest {

	public static void main(String[] args) {
		Map<String, String> employee = new HashMap<String, String>();
		employee.put("207", "xxx");
		employee.put("208", "sxd");
		employee.put("209", "cxl");
		employee.put("210", "hhw");
		employee.put("211", "jjm");
		employee.put("212", "hcy");
		System.out.println("Employees number: " + employee.size());
		System.out.println(employee);
		
		//key-value一一对应
		employee.put("207", "oqj");
		System.out.println(employee);

	}

}
