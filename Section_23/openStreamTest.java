package com.Section_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class openStreamTest {
	public static void main(String[] args) throws IOException {
		//����URLʵ��
		URL url = new URL("http://www.baidu.com");
		//��ȡURL�����ֽ�������
		InputStream inputStream = url.openStream();
		//�ֽ������� ת Ϊ�ַ�������
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
		//�������������Ч��
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String data = bufferedReader.readLine();
		while(data != null) {
			System.out.println(data);
			data = bufferedReader.readLine();
		}
		bufferedReader.close();
		inputStreamReader.close();
		inputStream.close();
	}
}
