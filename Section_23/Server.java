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
		int  num = 0;
		System.out.println("�������������ȴ�����...");
		//ѭ������
		while(true) {
			//2. ����accept()�����������ȴ��ͻ�������(�����߳�)
			Socket sk = ss.accept();
			num++;
			System.out.println("�����ӿͻ���������" + num);
			SeverThread st = new SeverThread(sk);
			st.start();
		}
	}
}


