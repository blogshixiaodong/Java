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
		String info = null;
		OutputStream os = null;
		PrintWriter pw = null;
		try {
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			info = null;
			while((info = br.readLine()) != null) {
				System.out.println("Message: " + info);
			}
			
			socket.shutdownInput();
			os = socket.getOutputStream();
			pw = new PrintWriter(os);
			pw.write("欢迎");
			pw.flush();
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
