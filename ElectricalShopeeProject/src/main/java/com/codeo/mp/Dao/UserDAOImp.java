package com.codeo.mp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.codeo.mp.connection.DbUtil;
import com.codeo.mp.entity.User;

public class UserDAOImp implements UserDAO {

	private static final String INSERT_USER = "insert into user_registration(user_name, user_mobno, user_adderess, user_emailid, user_pass) values(?,?,?,?,?)" ;
	private static final String SELECT_ALL_USERS ="select * from user_registration ";
	private static final String DELETE_USER ="delete from user_registration where user_id= ?;";
	private static final String EDIT_USER = "select userid, user_name, user_mobno, user_adderess, user_emailid, user_pass from user_registration where user_id=?";
	private static  final String UPDATE_USERS_SQL = "update user_registration set user_name = ?,user_mobno= ?, user_adderess =?,user_emailid =?,user_pass =? where user_id = ?;";

	Connection con = null;

	@Override
	public void  insertUser(User user) {
  
		PreparedStatement preparedstatement = null;
		int result = 0;
		if(con != null)
		{
			try {
				preparedstatement = con.prepareStatement(INSERT_USER);
				if(preparedstatement!=null)
				{
					preparedstatement.setString(1, user.getuName());
					preparedstatement.setString(2, user.getuMobileno());
					preparedstatement.setString(3, user.getuAddress());
					preparedstatement.setString(4, user.getuEmail());
					preparedstatement.setString(5, user.getuPassword());
				}
				if(preparedstatement!=null)
				{
					result = preparedstatement.executeUpdate();
				}
				if(result!=0)
				{
					System.out.println("data is inserted");
				}
				else
				{
					System.out.println("data is not inserted");
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
	@Override
	public List<User> selectAllUsers() {
	
		List<User> users = new ArrayList<>();
		con = DbUtil.getconnection();
		PreparedStatement preparedstatement = null ;
 	try {
			preparedstatement= con.prepareStatement(SELECT_ALL_USERS);
            ResultSet resultset = preparedstatement.executeQuery();
			
			while(resultset.next())
			{
				int id = resultset.getInt(1);
				String uName = resultset.getString(2);
				String	uMobileno = resultset.getString(3);
				String uAddress = resultset.getString(4);
				String uEmail = resultset.getString(5);
				String uPassword = resultset.getString(6);
				users.add(new User(id, uName , uMobileno , uAddress, uEmail , uPassword));
				}
			} catch (SQLException e) {
			e.printStackTrace();
		} 
		return users;
	}
	@Override
	public boolean deleteUser(int id) throws SQLException {
		boolean rowDeleted =false;
		con = DbUtil.getconnection();
		PreparedStatement preparedstatement = null ;
	     preparedstatement= con.prepareStatement(DELETE_USER);
	     preparedstatement.setInt(1, id);
	     rowDeleted = preparedstatement.executeUpdate() > 0;

	     return rowDeleted;
     }
	
	@Override
	public User editUser(int id) {
		User user = null;
		con = DbUtil.getconnection();
		PreparedStatement preparedstatement = null ;
		
		try {
			preparedstatement= con.prepareStatement(EDIT_USER);
	    	preparedstatement.setInt(1, id);
			
			ResultSet rs = preparedstatement.executeQuery();
			while(rs.next())
			{
				String uName = rs.getString(2);
				String uMobileno = rs.getString(3);
				String uAddress = rs.getString(4);
				String uEmail = rs.getString(5);
				String uPassword = rs.getString(6);
				user = new User(id, uName, uMobileno,uAddress, uEmail, uPassword);
				}
			} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	@Override
	public boolean updateUser(User user)  {
		boolean rowUpdated= false;
		con = DbUtil.getconnection();
		PreparedStatement preparedstatement = null ;
		
		try {
			preparedstatement = con.prepareStatement(UPDATE_USERS_SQL);
			
			preparedstatement.setString(1, user.getuName());
			preparedstatement.setString(2, user.getuMobileno());
			preparedstatement.setString(3, user.getuAddress());
			preparedstatement.setString(4, user.getuEmail());
			preparedstatement.setString(5, user.getuPassword());
			preparedstatement.setInt(6, user.getId());
			
			 rowUpdated = preparedstatement.executeUpdate() >0 ;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowUpdated;
	}
	
}