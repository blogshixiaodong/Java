package com.Section_22;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class SqlServer {
	private Connection connection;
	private Statement statement;
	private String URl = "jdbc:sqlserver://localhost:1433;";
	String DataBaseName = "Book";
	private String username = "sa";
	private String password = "sxd";
	public SqlServer() {
		makeConnection(DataBaseName);
		createDataBase(DataBaseName);
		
	}
	

	private void makeConnection(String DataBaseName) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(URl, username, password);
			statement = connection.createStatement();  	//创建连接数据库实例
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	private void createDataBase(String DataBaseName) {
		//创建数据库
		try {	
			statement.executeUpdate("Create DataBase " + DataBaseName);
			statement.executeUpdate("use " + DataBaseName);
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "创建数据库失败。");
		}
	}
	
	public static void main(String[] args) {
		SqlServer sqlSer = new SqlServer();
	}
		
}
