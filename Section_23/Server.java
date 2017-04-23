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
		int  num = 0;
		System.out.println("服务器启动，等待连接...");
		//循环监听
		while(true) {
			//2. 调用accept()方法监听，等待客户端连接(阻塞线程)
			Socket sk = ss.accept();
			num++;
			System.out.println("已连接客户端数量：" + num);
			SeverThread st = new SeverThread(sk);
			st.start();
		}
	}
}


