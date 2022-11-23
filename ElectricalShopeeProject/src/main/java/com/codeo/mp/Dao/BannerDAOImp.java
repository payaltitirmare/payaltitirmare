package com.codeo.mp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.codeo.mp.connection.DbUtil;
import com.codeo.mp.entity.Banner;

public class BannerDAOImp  implements BannerDAO{

	
	private static final String insert_banner ="insert into banner_operation(banner_tagline,imageFileName,status) values(?,?,?);";
	
	public boolean addbanner(Banner banner) {
		
		boolean flag= false;
		Connection con = DbUtil.getconnection();
		PreparedStatement psmt = null;
		
		if(con!=null)
		{
			try {
				psmt= con.prepareStatement(insert_banner);
				if(psmt!=null)
				{
					psmt.setString(1, banner.getBannertagline());
					psmt.setString(2, banner.getImageFileName());
					psmt.setString(3, banner.getStatus());
				}
				int result =0;
				
				if(psmt !=null)
				{
					result = psmt.executeUpdate();
				}
				
				if(result !=0)
				{
					System.out.println("data is inserted");
				}
				else
				{
					System.out.println("data is not inserted");
				}
				flag = true;
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return true;
	}

}
