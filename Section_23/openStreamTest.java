package com.Section_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class openStreamTest {
	public static void main(String[] args) throws IOException {
		//创建URL实例
		URL url = new URL("http://www.baidu.com");
		//获取URL对象字节输入流
		InputStream inputStream = url.openStream();
		//字节输入流 转 为字符输入流
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
		//创建缓冲区提高效率
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
