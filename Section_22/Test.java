package com.Section_22;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//sql server exec sys.sp_readerrorlog 0, 1, 'listening'
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Connection conn;
        Statement stmt;
        ResultSet rs;
        String url = "jdbc:sqlserver://localhost:1433;DataBaseName=STUDENT;";
        String sql = "select * from student";
        try {
        	// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // �������ݿ�
            conn = DriverManager.getConnection(url, "sa", "sxd");
            // ����Statement����
            stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE);
            /**
             * Statement createStatement() ����һ�� Statement �������� SQL ��䷢�͵����ݿ⡣
             */
            // ִ�����ݿ��ѯ���
            rs = stmt.executeQuery(sql);
            /**
             * ResultSet executeQuery(String sql) throws SQLException ִ�и����� SQL
             * ��䣬����䷵�ص��� ResultSet ����
             */
            while (rs.next()) {
                int id = rs.getInt("Sno");
           
//                if(id == 201215121) {
//                	rs.deleteRow();
//                }
                String name = rs.getString("Sname");
                int age = rs.getInt("Sage");
                System.out.println("Sno:" + id + "\tSame:" + name + "\tSage:" + age);
            }
            if (rs != null) {
                rs.close();
                rs = null;
            }
            if (stmt != null) {
                stmt.close();
                stmt = null;
            }
            if (conn != null) {
                conn.close();
                conn = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("���ݿ�����ʧ��");
        }
    }
}