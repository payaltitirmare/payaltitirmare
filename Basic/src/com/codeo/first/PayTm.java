package com.codeo.first;

public class PayTm {

	private int account_no;
    private String accholder_name;
    private float balanace;
    
    
    public PayTm()
    {
    	
    }
    
    

	public void setaccoubt_no(int account_no)
    {
    	this.account_no=account_no;
    }
    
    public int getaccount_no()
    {
    	return account_no;
    }
    
    public void setaccholder_name(String accholder_name) {
    	this.accholder_name=accholder_name;
    }
    public String getaccholder_name()
    {
    	return accholder_name;
    }

	protected float getBalanace() {
		return balanace;
	}

	protected void setBalanace(float balanace) {
		this.balanace = balanace;
	}
    
    
}
