package com.codeo.shop.Dao;

import java.util.List;

import com.codeo.shop.entity.Category;

public interface CategoryInterface {

	
	public boolean addcategory(Category category);
	
	public boolean editCategory(Category category);
	
	public List<Category> getCategoryList();
	
}
