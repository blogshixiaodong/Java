package com.Section_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 基于TCP协议的Socket通信，实现用户登录
 * 
 * 服务端
 */
public class Server {
	public static void main(String[] args) throws IOException {
		//1. 创建服务端的Socket，（ServerSocket）,绑定并监听端口
		ServerSocket ss = new ServerSocket(8888);
		//2. 调用accept()方法监听，等待客户端连接(阻塞线程)
		System.out.println("服务器启动，等待连接...");
		Socket sk = ss.accept();
		//3. 获取输入流，读取客户端信息
		InputStream is = sk.getInputStream(); 
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String info = null;
		while((info = br.readLine()) != null) {
			System.out.println("客户端信息：" + info);
		}
		sk.shutdownInput();
		//4. 响应客户端
		OutputStream os = sk.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		pw.write("欢迎...");
		pw.flush();
		
		//5. 关闭资源
		pw.close();
		os.close();
		
		
		br.close();
		isr.close();
		is.close();
		sk.close();
		ss.close();
	}
}
