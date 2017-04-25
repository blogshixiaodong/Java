package com.IO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileList {
	
	public static void listDirectory(File dir, String fileName) throws IOException {
		if(!dir.exists()) {
			throw new IllegalArgumentException("Ŀ¼��" + dir + "������.");
		}
		if(!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "����Ŀ¼");
		}
		/*
		String[] filename = dir.list();
		for (String string : filename) {
			System.out.println(dir + string);
		}*/
		File[] files = dir.listFiles();
		if(files != null && files.length > 0) {
			for (File file : files) {
				if(file.isDirectory()) {
					listDirectory(file, fileName);
				} else {
					if(file.getName().contains(fileName)) {
						System.out.println(file);
					}
					
					
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ļ���");
		String fileName = scanner.nextLine();
		System.out.println("�������ļ�ģ��·��:");
		String filePath = scanner.nextLine();
		listDirectory(new File(filePath), fileName);
	}
}
