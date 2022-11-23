package com.codeo.mp.entity;

public class User {

	private int id =0;
    private   String uName= null;
	 private  String uMobileno = null;
	  private String uAddress = null;
	  private String uEmail = null;
	  private String uPassword = null;
	  
	public User(String uName, String uMobileno, String uAddress, String uEmail, String uPassword) {
		super();
		this.uName = uName;
		this.uMobileno = uMobileno; 
		this.uAddress = uAddress;
		this.uEmail = uEmail;
		this.uPassword = uPassword;
	}
	 
	public User(int id, String uName, String uMobileno, String uAddress, String uEmail, String uPassword) {
		super();
		this.id = id;
		this.uName = uName;
		this.uMobileno = uMobileno;
		this.uAddress = uAddress;
		this.uEmail = uEmail;
		this.uPassword = uPassword;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuMobileno() {
		return uMobileno;
	}

	public void setuMobileno(String uMobileno) {
		this.uMobileno = uMobileno;
	}

	public String getuAddress() {
		return uAddress;
	}

	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	@Override
	public String toString() {
		return "UserData [id=" + id + ", uName=" + uName + ", uMobileno=" + uMobileno + ", uAddress=" + uAddress
				+ ", uEmail=" + uEmail + ", uPassword=" + uPassword + "]";
	}
	
	
 }
