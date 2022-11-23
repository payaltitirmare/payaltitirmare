package com.codeo.mp.entity;

public class Banner {

	private String bann_id =null;
	private String bannertagline=null;
	private String imageFileName= null;
	private String status = null;
	
	

	public Banner(String bannertagline, String imageFileName, String status) {
		this.bannertagline = bannertagline;
		this.imageFileName =imageFileName;
		this.status = status;
	}

	
	public Banner(String bann_id, String bannertagline, String imageFileName, String status) {
		super();
		this.bann_id = bann_id;
		this.bannertagline = bannertagline;
		this.imageFileName =imageFileName;
		this.status = status;
	}
	
	public String getBann_id() {
		return bann_id;
	}

	public void setBann_id(String bann_id) {
		this.bann_id = bann_id;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getBannertagline() {
		return bannertagline;
	}
	public void setBannertagline(String bannertagline) {
		this.bannertagline = bannertagline;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
