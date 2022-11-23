package com.codeo.mp.Dao;

import java.sql.SQLException;
import java.util.List;

import com.codeo.mp.entity.User;

public interface UserDAO {

	public List<User> selectAllUsers();

	public void insertUser(User user);

	public boolean deleteUser(int id) throws SQLException;

	public User editUser(int id);

	public boolean updateUser(User user);
	
	
}
