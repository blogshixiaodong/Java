package com.IO;

import java.io.UnsupportedEncodingException;
import java.util.Iterator;

public class EncodingDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String string = "Java编码";
		//默认GBK 中文两个字节  英文一个字节
		byte[] bytes = string.getBytes();
		for (byte b : bytes) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();
		//UTF-8 中文三个字节 英文一个字节
		bytes = string.getBytes("UTF-8");
		for (byte b : bytes) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();
		//Java双字节编号UTF-16be  中英文均两个字节
		bytes = string.getBytes("UTF-16be");
		for (byte b : bytes) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();
		Integer i = 5;
		System.out.println(i.toString());
		while(true) {
			
		}
	}
}
