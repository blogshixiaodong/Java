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
         System.out.println("URL Ϊ��" + url.toString());
         System.out.println("Э��Ϊ��" + url.getProtocol());
         System.out.println("��֤��Ϣ��" + url.getAuthority());
         System.out.println("�ļ��������������" + url.getFile());
         System.out.println("��������" + url.getHost());
         System.out.println("·����" + url.getPath());
         System.out.println("�˿ڣ�" + url.getPort());
         System.out.println("Ĭ�϶˿ڣ�" + url.getDefaultPort());
         System.out.println("���������" + url.getQuery());
         System.out.println("��λλ�ã�" + url.getRef());
         
         System.out.println("����URL��������: " + urlConnection.getContent());
         System.out.println("����URL��������: " + urlConnection.getContentEncoding());
         System.out.println("���ȣ�" + urlConnection.getContentLength());
         System.out.println("���ͣ�" + urlConnection.getContentType());
	   
		/*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		String line = null;
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferedReader.close();*/
	}
}
