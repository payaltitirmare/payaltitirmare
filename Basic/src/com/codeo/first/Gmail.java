package com.codeo.first;

public class Gmail {

	private String email;
	private String password;
	
	public Gmail()
	{
		
	}
	
	public Gmail(String email,String password)
	{
		
	}

	@Override
	public String toString() {
		return "Gmail [email=" + email + ", password=" + password + "]";
	}


	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getPassword() {
		return password;
	}

	protected void setPassword(String password) {
		this.password = password;
	}
	
	

}
