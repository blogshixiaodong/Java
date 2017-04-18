package com.Section_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class Function {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://blogshixiaodong.github.io/");
		URLConnection urlConnection = url.openConnection();
         System.out.println("URL 为：" + url.toString());
         System.out.println("协议为：" + url.getProtocol());
         System.out.println("验证信息：" + url.getAuthority());
         System.out.println("文件名及请求参数：" + url.getFile());
         System.out.println("主机名：" + url.getHost());
         System.out.println("路径：" + url.getPath());
         System.out.println("端口：" + url.getPort());
         System.out.println("默认端口：" + url.getDefaultPort());
         System.out.println("请求参数：" + url.getQuery());
         System.out.println("定位位置：" + url.getRef());
         
         System.out.println("检索URL链接内容: " + urlConnection.getContent());
         System.out.println("检索URL链接内容: " + urlConnection.getContentEncoding());
         System.out.println("长度：" + urlConnection.getContentLength());
         System.out.println("类型：" + urlConnection.getContentType());
	   
		/*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		String line = null;
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferedReader.close();*/
	}
}
