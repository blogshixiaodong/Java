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
 * ����TCPЭ���Socketͨ�ţ�ʵ���û���¼
 * 
 * �����
 */
public class Server {
	public static void main(String[] args) throws IOException {
		//1. ��������˵�Socket����ServerSocket��,�󶨲������˿�
		ServerSocket ss = new ServerSocket(8888);
		//2. ����accept()�����������ȴ��ͻ�������(�����߳�)
		System.out.println("�������������ȴ�����...");
		Socket sk = ss.accept();
		//3. ��ȡ����������ȡ�ͻ�����Ϣ
		InputStream is = sk.getInputStream(); 
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String info = null;
		while((info = br.readLine()) != null) {
			System.out.println("�ͻ�����Ϣ��" + info);
		}
		sk.shutdownInput();
		//4. ��Ӧ�ͻ���
		OutputStream os = sk.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		pw.write("��ӭ...");
		pw.flush();
		
		//5. �ر���Դ
		pw.close();
		os.close();
		
		
		br.close();
		isr.close();
		is.close();
		sk.close();
		ss.close();
	}
}
