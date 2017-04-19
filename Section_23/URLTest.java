package com.Section_23;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {
	public static void main(String[] args) throws MalformedURLException {
		//创建URL实例
		URL url = new URL("http://www.imooc.com");
		//? 参数    #锚点
		URL url2 = new URL(url, "/index.html?username = tom#test");
		System.out.println("协议：" + url2.getProtocol());
		System.out.println("主机：" + url2.getHost());
		System.out.println("端口：" + url2.getPort());
		System.out.println("文件路径：" + url2.getPath());
		System.out.println("文件名：" + url2.getFile());
		System.out.println("相对路径：" + url2.getRef());
		System.out.println("查询字符串：" + url2.getQuery());
		
	}
}
