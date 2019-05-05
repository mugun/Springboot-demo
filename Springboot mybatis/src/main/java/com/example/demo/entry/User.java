package com.example.demo.entry;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class User {
	private int id;
	private String name;
	private int type;
	public static Connection getCon() {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/test";
		String user="root";
		String passwd="root";
		Connection conn=null;
		try {
			Class.forName(driver);
			conn=(Connection)DriverManager.getConnection(url, user, passwd);
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
		
		
	}
}
