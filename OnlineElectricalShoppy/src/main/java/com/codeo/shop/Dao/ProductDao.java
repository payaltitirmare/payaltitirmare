package com.codeo.shop.Dao;

import java.util.List;

import com.codeo.shop.entity.Product;

public interface ProductDao {

	public boolean addProduct(Product product);

	public boolean update(Product product);

	public List<Product> getlist();

	public boolean delete(int id);

	public Product editProd(int id);
	
	
}
