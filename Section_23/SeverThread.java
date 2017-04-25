package com.Section_23;
/*
 * 服务器端线程处理类
 */

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class SeverThread extends Thread {
	Socket socket = null;
	public SeverThread(Socket socket) {
		this.socket = socket;
	}
	//线程执行操作，响应客户请求
	
	public void run() {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		Scanner scanner = null;
		
		String info = null;
		OutputStream os = null;
		PrintWriter pw = null;
		try {
			//获取客户端字节输入流
			is = socket.getInputStream();
			//字节流->字符流
			isr = new InputStreamReader(is);
			//缓冲区
			br = new BufferedReader(isr);
			
			scanner  = new Scanner(is);
			
			//服务端输出流
			os = socket.getOutputStream();
			//打印流
			pw = new PrintWriter(os, true);
			
			info = null;
			
			while(scanner.hasNextLine()) {
				info = scanner.nextLine();
				System.out.println("From Client: " + info);
				if(info.equalsIgnoreCase("exit")) {
					socket.shutdownInput();
					pw.println("Bye");
					pw.flush();
					break;
				}
				pw.println("Recevie!");
				pw.flush();
			}
			/*while(true) {
				while((info = br.readLine()) != null) {
					System.out.println("Message: " + info);
				}
				if(info.equalsIgnoreCase("exit")) {
					socket.shutdownInput();	
					return;
				}
				pw.println("Recviced!");
				pw.flush();
			}*/
				
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pw != null) {
					pw.close();
				}
				if (os != null) {
					os.close();
				}
				if (br != null) {
					br.close();
				}
				if (isr != null) {
					isr.close();
				}
				if (is != null) {
					is.close();
				}
				if(socket != null) {
					socket.close();
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}
