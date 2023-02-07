package com.codeo.shop.Dao;

import java.util.List;

import com.codeo.shop.entity.Product;

public interface ProductDao {

	public boolean addProduct(Product product);

	public boolean update(Product product);

	public List<Product> getAllProducts();

	public boolean delete(int id);

	//public Product editProd(int id);
	
	public List getAllProductsById(int id);
	
	public List  getAllProductsForDetails(int id);

	public Product getProduct(int prod_id);

	public List<Product> getlist();

	public Product getProductById(int id);

	
	
	
}
