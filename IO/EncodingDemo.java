package com.IO;

import java.io.UnsupportedEncodingException;
import java.util.Iterator;

public class EncodingDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String string = "Java����";
		//Ĭ��GBK ���������ֽ�  Ӣ��һ���ֽ�
		byte[] bytes = string.getBytes();
		for (byte b : bytes) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();
		//UTF-8 ���������ֽ� Ӣ��һ���ֽ�
		bytes = string.getBytes("UTF-8");
		for (byte b : bytes) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();
		//Java˫�ֽڱ��UTF-16be  ��Ӣ�ľ������ֽ�
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
