package com.codeo.smj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.codeo.smj.entity.SuperAdmin;
import com.codeo.sms.dbUtil.ConnectionUtil;

public class SuperAdminDao {

	SuperAdmin sadmin = null;
	private final String insert_query ="insert into superadmin_registration(name, email, password) values(?,?,?)";	
	private final String login_query ="select * from  superadmin_registration where email= ? and password= ?"; //qiestion mark for loose coupling 
	// persistent logic  == > create update retriew insert edit delet...

	Connection connection = ConnectionUtil.getConnection();
	
	public boolean insertsuperadmin(SuperAdmin superadmin) throws SQLException {
	
		boolean result1 = false;
		
		
		PreparedStatement psmt=null;
		
		psmt= connection.prepareStatement(insert_query);
		
		if(psmt !=null)
		{
			psmt.setString(1, superadmin.getName());
			psmt.setString(2, superadmin.getEmail());
			psmt.setString(3, superadmin.getPassword());
	     }

		int result =0;
		
		if(psmt!= null)
		{
			result = psmt.executeUpdate();
			result1 = true;
		}
		
	    if(result !=0)
	    {
	    	System.out.println("data is inserted succesfully");
	    	
	    }
	    else
	    {
	    	System.out.println("something went wrong ");
	    	
	    }
	    return result1;
	}

	
	public SuperAdmin loginServlet(String username, String password) {
		
		SuperAdmin superadmin = new SuperAdmin();
		
		try {
			PreparedStatement psmt = connection.prepareStatement(login_query);
			
			if(psmt!=null)
			{
				psmt.setString(1, username);
				psmt.setString(2, password);
			}
			
		
			ResultSet rs = psmt.executeQuery();
			
			if(rs.next())
			{
		
				superadmin.setName(rs.getString(2));
				superadmin.setEmail(rs.getString(3));
				superadmin.setPassword(rs.getString(4));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return superadmin;
	}

}
