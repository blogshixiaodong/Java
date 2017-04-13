package com.Section_22;


import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class SqlServer {
	private Connection connection;
	private Statement statement;
	ResultSet rSet;
	private String URl = "jdbc:sqlserver://localhost:1433;";
	String DataBaseName = "Book";
	String TableName = "book";
	String TableArgs = "name varchar(10), author varchar(10), ISBN char(17) Primary Key, price float";
	private String username = "sa";
	private String password = "sxd";
	public SqlServer() {
		//���Ӳ���
		makeConnection(DataBaseName);
		//�����µ����ݿ�
		if(!createDataBase(DataBaseName)) {
			deleteDB(DataBaseName);
			createDataBase(DataBaseName);
			JOptionPane.showMessageDialog(null, "Try");
		}
		if(createTable(DataBaseName, TableName, TableArgs)) {	
			
		} 
		
		//�ر����ӣ��ͷ���Դ
		closeConnection();
		
	}

	private void closeConnection() {
		try {
			rSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}

	private void makeConnection(String DataBaseName) {
		try {
			//�������ݿ�����
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(URl, username, password);	//�������ݿ�
			statement = connection.createStatement();  	//�����������ݿ�ʵ��
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	private boolean createDataBase(String DataBaseName) {
		//�������ݿ�
		if(isDBExist(DataBaseName)) {
			return false;
		}
		try {
			statement.executeUpdate("Create DataBase " + DataBaseName);
			statement.executeUpdate("use " + DataBaseName);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "�������ݿ�ʧ�ܡ�");
			return false;
		}
	}
	
	private boolean deleteDB(String DataBaseName) {
		String sql = "Drop DataBase " + DataBaseName;
		try {
			statement.execute(sql);
			return true;	
		} catch (SQLException e) {
			return false;
		}
	}
	
	private boolean isDBExist(String DataBaseName) {
		String sql = "select * from sysdatabases where name='" + DataBaseName + "'";
		try {
			rSet = statement.executeQuery(sql);
			if(rSet.next()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private boolean createTable(String DataBaseName, String TableName, String TableArgs) {
		//�������ݱ�
		if(isTableExist(TableName)) {
			return false;
		}	
		try {
			statement.executeUpdate("use " + DataBaseName);
			statement.executeUpdate("Create Table " + TableName + "(" + TableArgs + ")");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "�������ݱ�ʧ�ܡ�");
			return false;
		}
	}
	
	private boolean isTableExist(String TableName) {
		try {
			//��ȡ���ݿ����б�ṹ������Ŀ�����
			ResultSet rs = connection.getMetaData().getTables(null, null, TableName, null);
			if(rs.next()) {
				rs.close();
				return true;
			} else {
				rs.close();
				return false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static void main(String[] args) {
		SqlServer sqlSer = new SqlServer();
//		ResultSet resultSet = statement.getResultSet();
//		if(resultSet.next()) {
//			resultSet
//		}
	}
		
}
