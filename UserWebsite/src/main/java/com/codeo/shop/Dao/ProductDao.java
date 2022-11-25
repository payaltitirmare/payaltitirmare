package com.codeo.shop.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.codeo.shop.dbutil.ConnectionProvider;
import com.codeo.shop.entity.Product;

public class ProductDao {

	private static final String selct_product ="SELECT * FROM product_operation ";
	  
	public List <Product> getAllProducts()
	{
		List<Product> list = new ArrayList<Product>();
		Product product = null;
Connection con = ConnectionProvider.getconnection();
try {
	Statement statement = con.createStatement();
	ResultSet resultset =null;
	
	resultset =statement.executeQuery(selct_product);
	
	//prod_id, prod_name, prod_description, prod_price, prod_discount, prod_quantity, prod_imageName
	while(resultset.next())
	{
		product = new Product();
		product.setId(resultset.getInt("prod_id"));
		product.setProd_name(resultset.getString("prod_name"));
		product.setProd_description(resultset.getString("prod_description"));
		product.setProd_price(resultset.getString("prod_price"));
		product.setProd_discount(resultset.getString("prod_discount"));
		product.setProd_imageName(resultset.getString("prod_imageName"));
	
		list.add(product);
	}
} 
catch (SQLException e) {
	e.printStackTrace();
}
	return list;
		
	}
}
