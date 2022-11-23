package com.codeo.mp.entity;

public class Product {
	
	private Integer id = null;
	private String prod_name = null;
	private String prod_description = null;
	private String prod_price = null;
	private String prod_discount = null;
	private String prod_quantity = null;
	private String prod_imageName = null;
	
	public Product(String id, String prod_name, String prod_description, String prod_price, String prod_discount,
			String prod_quantity, String prod_imageName) {
		super();
	
		this.prod_name = prod_name;
		this.prod_description = prod_description;
		this.prod_price = prod_price;
		this.prod_discount = prod_discount;
		this.prod_quantity = prod_quantity;
		this.prod_imageName = prod_imageName;
	}
	
	public Product(String prod_name, String prod_description, String prod_price, String prod_discount,
			String prod_quantity, String prod_imageName) {
		super();
		this.prod_name = prod_name;
		this.prod_description = prod_description;
		this.prod_price = prod_price;
		this.prod_discount = prod_discount;
		this.prod_quantity = prod_quantity;
		this.prod_imageName = prod_imageName;
	}
  
	public Product() {
		
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_description() {
		return prod_description;
	}

	public void setProd_description(String prod_description) {
		this.prod_description = prod_description;
	}

	public String getProd_price() {
		return prod_price;
	}

	public void setProd_price(String prod_price) {
		this.prod_price = prod_price;
	}

	public String getProd_discount() {
		return prod_discount;
	}

	public void setProd_discount(String prod_discount) {
		this.prod_discount = prod_discount;
	}

	public String getProd_quantity() {
		return prod_quantity;
	}

	public void setProd_quantity(String prod_quantity) {
		this.prod_quantity = prod_quantity;
	}

	public String getProd_imageName() {
		return prod_imageName;
	}

	public void setProd_imageName(String prod_imageName) {
		this.prod_imageName = prod_imageName;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", prod_name=" + prod_name + ", prod_description=" + prod_description
				+ ", prod_price=" + prod_price + ", prod_discount=" + prod_discount + ", prod_quantity=" + prod_quantity
				+ ", prod_imageName=" + prod_imageName + "]";
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
}
