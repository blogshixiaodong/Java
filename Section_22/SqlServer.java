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
		//连接操作
		makeConnection(DataBaseName);
		//建立新的数据库
		if(!createDataBase(DataBaseName)) {
			deleteDB(DataBaseName);
			createDataBase(DataBaseName);
			JOptionPane.showMessageDialog(null, "Try");
		}
		if(createTable(DataBaseName, TableName, TableArgs)) {	
			
		} 
		
		//关闭连接，释放资源
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
			//加载数据库驱动
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(URl, username, password);	//连接数据库
			statement = connection.createStatement();  	//创建连接数据库实例
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	private boolean createDataBase(String DataBaseName) {
		//创建数据库
		if(isDBExist(DataBaseName)) {
			return false;
		}
		try {
			statement.executeUpdate("Create DataBase " + DataBaseName);
			statement.executeUpdate("use " + DataBaseName);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "创建数据库失败。");
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
		//创建数据表
		if(isTableExist(TableName)) {
			return false;
		}	
		try {
			statement.executeUpdate("use " + DataBaseName);
			statement.executeUpdate("Create Table " + TableName + "(" + TableArgs + ")");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "创建数据表失败。");
			return false;
		}
	}
	
	private boolean isTableExist(String TableName) {
		try {
			//获取数据库所有表结构，查找目标表名
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
