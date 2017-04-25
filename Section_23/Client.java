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
 * �ͻ���
 * 
 */
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// 1. �����ͻ���Socket��ָ����������ַ�Լ��˿�
		Socket socket = new Socket("localhost", 8888);
		
		//�����ͻ��������
		OutputStream os = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		
		//��ȡ�����������
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		//��������
		Scanner scanner = new Scanner(System.in);
		
		
		String info = "�û�User3������: ";
		System.out.println("�����ӷ�����");
		
		pw.println(info);
		pw.flush();
		
		
		
		while(scanner.hasNext()) {
			String line = scanner.nextLine();
			pw.println(line);
			pw.flush();
			line = br.readLine();
			System.out.println("From Server: " + line);
			
		}
		/*
		while(!info.equalsIgnoreCase("Exit")) {
			info = scanner.nextLine();	
			pw.println("�����û�admin����Ϣ: " + info);
			pw.flush();
		}
		
		System.out.println("�ѶϿ��ͷ�����������");
		pw.println("�û�admin�ѶϿ�����");
		pw.flush();
		socket.shutdownOutput();
		
		
		
		String infos = null;
		while((infos = br.readLine()) != null) {
			System.out.println("�������Ϣ��" + info);
		}
		
		*/
		//�ر���Դ
		br.close();
		isr.close();
		is.close();
		
		scanner.close();
		pw.close();
		os.close();
		socket.close();
	}
}
