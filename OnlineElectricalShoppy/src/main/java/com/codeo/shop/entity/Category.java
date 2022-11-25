package com.codeo.shop.entity;

public class Category {

	
	private int Id =0;
	private String Cat_title=null;
	private String  cat_description	=null;
	

	public Category( String cat_title, String cat_description) {
	     
		this.Cat_title = cat_title;
		this.cat_description = cat_description;
	}


	public Category( String cat_title, String cat_description, int Id) {
	      this.Id = Id;
		this.Cat_title = cat_title;
		this.cat_description = cat_description;
	}


	public Category() {
		
	}


	public String getCat_title() {
		return Cat_title;
	}


	public void setCat_title(String cat_title) {
		Cat_title = cat_title;
	}


	public String getCat_description() {
		return cat_description;
	}


	public void setCat_description(String cat_description) {
		this.cat_description = cat_description;
	}
	
}
