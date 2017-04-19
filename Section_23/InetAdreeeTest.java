package com.Section_23;

import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAdreeeTest {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address.getHostName());
		System.out.println(address.getHostAddress());
		
		byte[] b = address.getAddress();
		System.out.println(Arrays.toString(b));
		
		InetAddress address2 = InetAddress.getByName("119.75.217.109");
		System.out.println(address2.getHostName());
		System.out.println(address2.getHostAddress());
	}
}
