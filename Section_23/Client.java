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
import java.util.Scanner;

/*
 * 客户端
 * 
 */
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// 1. 创建客户端Socket，指定服务器地址以及端口
		Socket socket = new Socket("localhost", 8888);
		OutputStream os = socket.getOutputStream();
		Scanner scanner = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(os);
		
		String info = "用户admin已连接: ";
		System.out.println("已连接服务器");
		
		pw.println(info);
		pw.flush();
		while(!info.equalsIgnoreCase("Exit")) {
			info = scanner.nextLine();	
			pw.println("来自用户admin的信息: " + info);
			pw.flush();
		}
		
		System.out.println("已断开和服务器的链接");
		pw.println("用户admin已断开连接");
		pw.flush();
		socket.shutdownOutput();
		
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String infos = null;
		while((infos = br.readLine()) != null) {
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
