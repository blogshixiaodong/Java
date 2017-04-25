package com.Section_23;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

public class DatagramServerTest {
	public static void main(String[] args) {
		System.out.println("Welcome! The server is running...");
		String line = "Datagram packet from server: I love Java Programing.\n";
		String promptString = line.toUpperCase() + "Enter quit to stop";
		try {
			//���������Datagram�׽���
			DatagramSocket socket = new DatagramSocket(8888);
			//�������ݱ����ڷ���/����
			DatagramPacket packet;
			//�ֽ�����
			byte[] buf = new byte[1024];
			//���ڽ������ݱ�
			packet = new DatagramPacket(buf, buf.length);
			
			socket.receive(packet);
			buf = promptString.getBytes();
			
			
			InetAddress address = packet.getAddress();
			
			int port = packet.getPort();
			sending(socket, buf, buf.length, address, port);
			
			while(true) {
				buf = new byte[256];
				packet = new DatagramPacket(buf, buf.length);
				
				socket.receive(packet);
				String receive = new String(packet.getData());
				
				buf = receive.toUpperCase().getBytes();
				sending(socket, buf, buf.length, address, port);
				
				buf = new byte[256];
				String wordCount = "(Converting from server and packet length: " + receive.trim().length() + ")";
				packet = new DatagramPacket(buf, buf.length);
				
				socket.receive(packet);
				buf = wordCount.getBytes();
				sending(socket, buf, buf.length, address, port);
			}
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void sending(DatagramSocket socket, byte[] buf, int length, InetAddress address, int port) {
		DatagramPacket sendPacket = new DatagramPacket(buf, buf.length, address, port);
		try {
			socket.send(sendPacket);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
