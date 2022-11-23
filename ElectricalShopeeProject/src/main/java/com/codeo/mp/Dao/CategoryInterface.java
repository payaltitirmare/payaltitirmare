package com.codeo.mp.Dao;

import java.util.List;

import com.codeo.mp.entity.Category;

public interface CategoryInterface {

	
	public boolean addcategory(Category category);
	
	public boolean editCategory(Category category);
	
	public List<Category> getCategoryList();
	
}
