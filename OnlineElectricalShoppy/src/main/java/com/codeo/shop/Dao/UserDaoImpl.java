package com.codeo.shop.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.codeo.shop.dbutil.ConnectionProvider;
import com.codeo.shop.entity.User;

public class UserDaoImpl implements UserDAO {


	private static final String INSERT_USER = "insert into user_registration(user_name, user_mobno, user_adderess, user_emailid, user_pass) values(?,?,?,?,?)" ;
	private static final String SELECT_ALL_USERS ="select * from user_registration ";
	private static final String DELETE_USER ="delete from user_registration where user_id= ?;";
	private static final String EDIT_USER = "select userid, user_name, user_mobno, user_adderess, user_emailid, user_pass from user_registration where user_id=?";
	private static  final String UPDATE_USERS_SQL = "update user_registration set user_name = ?,user_mobno= ?, user_adderess =?,user_emailid =?,user_pass =? where user_id = ?;";
	
	Connection con = null;
	
	public List<User> selectAllUsers() {
		List<User> users = new ArrayList<>();
		
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
	public boolean insertUser(User user) {
	boolean status = false;
	con = ConnectionProvider.getconnection();
		PreparedStatement preparedstatement = null;
		int result = 0;
		if(con != null)
		{
			try {
				preparedstatement = con.prepareStatement(INSERT_USER);
				if(preparedstatement!=null)
				{
					preparedstatement.setString(1, user.getUser_name());
					preparedstatement.setString(2, user.getUser_mobno());
					preparedstatement.setString(3, user.getUser_adderess());
					preparedstatement.setString(4, user.getUser_emailid());
					preparedstatement.setString(5, user.getUser_pass());
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
				status = true;
			} catch (SQLException e) {
				
				e.printStackTrace();
			}catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		return status;
		
	}
	@Override
	public boolean deleteUser(int id) {
		
		boolean rowDeleted =false;
		con = ConnectionProvider.getconnection();
		PreparedStatement preparedstatement = null ;
	     try {
			preparedstatement= con.prepareStatement(DELETE_USER);
			 preparedstatement.setInt(1, id);
		     rowDeleted = preparedstatement.executeUpdate() > 0;
     
	     } catch (SQLException e) {
			e.printStackTrace();
		}
	    
	     return rowDeleted;
     }
	@Override
	public boolean update(User user) {
		
		boolean flag = false;
		try {
			con = ConnectionProvider.getconnection();
			PreparedStatement preparedStatement = con.prepareStatement(UPDATE_USERS_SQL);
			preparedStatement.executeUpdate();
			flag = true;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	@Override
	public User edituser(int id) {
		
		User user = new User ();
		con = ConnectionProvider.getconnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet resultset = stmt.executeQuery(EDIT_USER);
			
			if(resultset.next())
			{
				user.setId(resultset.getInt("user_id"));
				user.setUser_name(resultset.getString("user_name"));
				user.setUser_mobno(resultset.getString("user_mobno"));
				user.setUser_adderess(resultset.getString("user_adderess"));
				user.setUser_emailid(resultset.getString("user_emailid"));
				user.setUser_pass(resultset.getString("user_pass"));
		}
			} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return user;
	}
	
	public boolean delete(int id) {
		 boolean status=false;
		con = ConnectionProvider.getconnection();
		
		  PreparedStatement preparedStatement;
		try {
			preparedStatement = con.prepareStatement(DELETE_USER);
			preparedStatement.executeUpdate();
			status =true;
           
		} catch (SQLException e) {
			e.printStackTrace();
		}
			  return true;
		}
     }
