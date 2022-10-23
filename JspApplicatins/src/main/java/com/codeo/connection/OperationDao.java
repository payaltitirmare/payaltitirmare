package com.codeo.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OperationDao {

	
	
	private static final String Driver_class="com.mysql.cj.jdbc.Driver";
	private static final String Url="jdbc:mysql://localhost:3306/student_info";
	private static final String User_name="root";
	private static final String password="";
	
	private static Connection con=null;
	
	public static Connection getConnection()
	{
		
		try {
			Class.forName(Driver_class);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(Url, User_name, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}
}
