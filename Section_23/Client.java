package com.Section_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.time.Period;

/*
 * 客户端
 * 
 */
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// 1. 创建客户端Socket，指定服务器地址以及端口
		Socket socket = new Socket("localhost", 8888);
		OutputStream os = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		pw.write("用户名：admin； 密码：sxd");
		pw.flush();
		socket.shutdownOutput();
		
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String info = null;
		while((info = br.readLine()) != null) {
			System.out.println("服务端信息：" + info);
		}
		
		
		//关闭资源
		br.close();
		isr.close();
		is.close();
		
		pw.close();
		os.close();
		socket.close();
	}
}
