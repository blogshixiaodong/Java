package com.Section_23;
/*
 * ���������̴߳�����
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
	//�߳�ִ�в�������Ӧ�ͻ�����
	
	public void run() {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		Scanner scanner = null;
		
		String info = null;
		OutputStream os = null;
		PrintWriter pw = null;
		try {
			//��ȡ�ͻ����ֽ�������
			is = socket.getInputStream();
			//�ֽ���->�ַ���
			isr = new InputStreamReader(is);
			//������
			br = new BufferedReader(isr);
			
			scanner  = new Scanner(is);
			
			//����������
			os = socket.getOutputStream();
			//��ӡ��
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
