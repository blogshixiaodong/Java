package com.Section_23;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {
	public static void main(String[] args) throws MalformedURLException {
		//����URLʵ��
		URL url = new URL("http://www.imooc.com");
		//? ����    #ê��
		URL url2 = new URL(url, "/index.html?username = tom#test");
		System.out.println("Э�飺" + url2.getProtocol());
		System.out.println("������" + url2.getHost());
		System.out.println("�˿ڣ�" + url2.getPort());
		System.out.println("�ļ�·����" + url2.getPath());
		System.out.println("�ļ�����" + url2.getFile());
		System.out.println("���·����" + url2.getRef());
		System.out.println("��ѯ�ַ�����" + url2.getQuery());
		
	}
}
