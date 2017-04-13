package com.Section_22;

import java.sql.Statement;
import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MetaDataTest {
	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String dbURL = "jdbc:sqlserver://localhost:1433;dataBaseName=STUDENT;";
			String username = "sa";
			String password = "sxd";
			Connection connection = DriverManager.getConnection(dbURL, username, password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENT");
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();	//�õ������ݿ��װ��Ԫ���ݶ���
			//��ȡ������
			int colNum = resultSetMetaData.getColumnCount();
			System.out.println("������" + colNum);
			for(int i = 1; i <= colNum; ++i) {
				//��ȡָ���е���󳤶�
				System.out.print("��" + i + "��" + "��󳤶ȣ�" + resultSetMetaData.getColumnDisplaySize(i) + " ");
				//��ȡָ�����ֶα����(��ǩ/����)
				System.out.print("�������" + resultSetMetaData.getColumnLabel(i) + " ");
				//��ȡ�ֶ���(������)
				System.out.print("�ֶ���: " + resultSetMetaData.getColumnName(i) + " ");
				//��ȡ����
				System.out.print("���ͣ�" + resultSetMetaData.getColumnTypeName(i) + " ");
				//��ȡ�ֽڴ�С
				System.out.print("�ֽ�����" + resultSetMetaData.getPrecision(i) + " ");
				//��ȡ����  ��ֵ����
				System.out.println("������" + resultSetMetaData.getTableName(i));
			}
			
			resultSet = statement.executeQuery("Select * From STUDENT WHERE SSEX = '��'");
			while (resultSet.next()) {
				
				String sno = resultSet.getString(1);
				String sname = resultSet.getString(2);
				String sex = resultSet.getString(3);
				String age = resultSet.getString(4);
				String dept = resultSet.getString(5);
				System.out.println(sno + " " + sname + " " + sex + " " + age + " " + dept);
			}
			
			
			resultSet.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
