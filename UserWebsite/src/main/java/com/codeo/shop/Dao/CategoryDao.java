package com.codeo.shop.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.codeo.shop.dbutil.ConnectionProvider;
import com.codeo.shop.entity.Category;

public class CategoryDao implements  CategoryInterface {

private String List_Category = "select * from add_category"	;

	Connection con = ConnectionProvider.getconnection();
	Category category = null;
	
	//catId, catTitle, catDescriptor
	public List<Category> getCategoryList() {
		
		// category = new Category();
	List<Category> list = new ArrayList<Category>();
		Statement stmt;
		try {
			stmt = con.createStatement();
			
			ResultSet rs = null;
			
			rs = stmt.executeQuery(List_Category);
			
			while(rs.next())
			{
				//int id = rs.getInt("id");
				String cat_title=rs.getString("catTitle");
				String cat_description= rs.getString("catDescriptor");
				
				list.add(new Category(  cat_title,  cat_description)) ;
				
				//System.out.println( cat_title+" "+ cat_description);
		
			}
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	return list;
	
	}
	
	public boolean editCategory(Category category) {
		
		return false;
	}
}
