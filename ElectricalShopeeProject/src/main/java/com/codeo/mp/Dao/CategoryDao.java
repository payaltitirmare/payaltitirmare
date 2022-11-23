package com.codeo.mp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.codeo.mp.connection.DbUtil;
import com.codeo.mp.entity.Category;


public class CategoryDao implements  CategoryInterface {

	
private String addcategory_query="insert into add_category(catTitle, catDescriptor) values(?,?)";
private String List_Category = "select * from add_category"	;

	Connection con = DbUtil.getconnection();
	Category category = null;
	public boolean addcategory(Category category) {
		boolean flag = false;
		  PreparedStatement psmt = null;
		if(con !=null)
		{
			try {
				psmt = con.prepareStatement(addcategory_query);
				if(psmt!=null )
				{
					psmt.setString(1, category.getCat_title());
					psmt.setString(2, category.getCat_description());
				}
				
				int result = psmt.executeUpdate();
				
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
		
		return flag;
	}
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
				int id = rs.getInt("id");
				String cat_title=rs.getString("catTitle");
				String cat_description= rs.getString("catDescriptor");
				
				list.add(new Category(  cat_title,  cat_description)) ;
				
				System.out.println( cat_title+" "+ cat_description);
		
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
