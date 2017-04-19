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
 * �ͻ���
 * 
 */
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// 1. �����ͻ���Socket��ָ����������ַ�Լ��˿�
		Socket socket = new Socket("localhost", 8888);
		OutputStream os = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		pw.write("�û�����admin�� ���룺sxd");
		pw.flush();
		socket.shutdownOutput();
		
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String info = null;
		while((info = br.readLine()) != null) {
			System.out.println("�������Ϣ��" + info);
		}
		
		
		//�ر���Դ
		br.close();
		isr.close();
		is.close();
		
		pw.close();
		os.close();
		socket.close();
	}
}
