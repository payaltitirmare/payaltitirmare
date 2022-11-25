package com.codeo.shop.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.codeo.shop.dbutil.ConnectionProvider;
import com.codeo.shop.entity.Login;

public class LoginDaoImpl implements LoginDao{

	@Override
	public String loginCheck(Login login) {
		
String query="select * from user_registration where user_emailid=? and user_pass=?";
		
		try {
			
			Connection con=ConnectionProvider.getconnection(); 
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,login.getEmail());
			ps.setString(2,login.getPassword());
			ResultSet rs=ps.executeQuery();
		
		if(rs.next()){
			return "true";
		}
		else{
			return "false";
		}
	} catch(Exception e){
		e.printStackTrace();
	}
	return "error";
	}
   }