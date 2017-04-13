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
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();	//得到对数据库封装的元数据对象
			//获取表列数
			int colNum = resultSetMetaData.getColumnCount();
			System.out.println("列数：" + colNum);
			for(int i = 1; i <= colNum; ++i) {
				//获取指定列的最大长度
				System.out.print("第" + i + "列" + "最大长度：" + resultSetMetaData.getColumnDisplaySize(i) + " ");
				//获取指定列字段标记名(标签/别名)
				System.out.print("标记名：" + resultSetMetaData.getColumnLabel(i) + " ");
				//获取字段名(定义名)
				System.out.print("字段名: " + resultSetMetaData.getColumnName(i) + " ");
				//获取类型
				System.out.print("类型：" + resultSetMetaData.getColumnTypeName(i) + " ");
				//获取字节大小
				System.out.print("字节数：" + resultSetMetaData.getPrecision(i) + " ");
				//获取表名  空值？？
				System.out.println("表名：" + resultSetMetaData.getTableName(i));
			}
			
			resultSet = statement.executeQuery("Select * From STUDENT WHERE SSEX = '男'");
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
