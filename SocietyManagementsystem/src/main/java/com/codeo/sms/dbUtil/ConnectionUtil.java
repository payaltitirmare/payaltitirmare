package com.codeo.sms.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	//create connection in this package 
	
	private static final String DriverClassName ="com.mysql.cj.jdbc.Driver" ;
	private static final String jdbcUrl ="jdbc:mysql://localhost:3306/societymanagement";
	private static final String username ="root";
	private static final String password ="";
	
	
	public static Connection getConnection() {
		
		Connection con =null;
		
		try {
			Class.forName(DriverClassName);
			
			con = DriverManager.getConnection(jdbcUrl, username, password);
			
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
    
}
