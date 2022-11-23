package com.codeo.mp.Dao;

import java.util.List;

import com.codeo.mp.entity.Product;

public interface ProductDao {

	public boolean addProduct(Product product);

	public boolean update(Product product);

	public List<Product> getlist();

	public boolean delete(int id);

	public Product editProd(int id);
	
	
}
