package com.Section_22;

import java.sql.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Practice {
	
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		String url = "jdbc:sqlserver://localhost:1433;DataBaseName = studb";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection connection = DriverManager.getConnection(url, "sa", "sxd");
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		statement.executeUpdate("use student");
		ResultSet rSet = statement.executeQuery("select * from student");
		ResultSetMetaData resultSetMetaData = rSet.getMetaData();
		while(rSet.next()) {
			for(int i = 1; i <= resultSetMetaData.getColumnCount(); ++i) {
				System.out.print(rSet.getString(i) + " ");
			}
		
			System.out.println();	
		}
		
		//statement.executeUpdate("Insert into Student values('3151911208', 'sxd', 'ÄÐ', 21,'CS')");
		//statement.executeUpdate("Delete from student where sname = 'sxd'");
//		rSet.first();
//		System.out.println(rSet.isFirst());
//		System.out.println(rSet.isBeforeFirst());
//		System.out.println(rSet.getString(2));
//		rSet.previous();
//		System.out.println(rSet.isBeforeFirst());
//		System.out.println(rSet.getRow());	
//		rSet.last();
//		rSet.deleteRow();
		System.out.println();
		
		rSet = statement.executeQuery("select * from student where sname like 'Íõ%'");
		
		
		resultSetMetaData = rSet.getMetaData();
		
		while(rSet.next()) {
			for(int i = 1; i <= resultSetMetaData.getColumnCount(); ++i) {
				System.out.print(rSet.getString(i) + " ");
			}
		
			System.out.println();	
		}
		
//		rSet.first();
//		rSet.deleteRow();
		
		 statement.executeUpdate("delete from student where sname like 'Íõ%'");
		
		
		
		while(rSet.next()) {
			System.out.println(rSet.getString(1));
		
			System.out.println();	
		}
		
		rSet.close();
		
		statement.close();
		connection.close();
		
	}
}
