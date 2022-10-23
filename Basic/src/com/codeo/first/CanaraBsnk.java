package com.codeo.first;

public class CanaraBsnk {

	public static void main(String[] args) {
		
		PayTm ptm = new PayTm();
		
		ptm.setaccoubt_no(12345);
		ptm.setaccholder_name("saurabh");
		ptm.setBalanace(4500);
		
		int no=ptm.getaccount_no();
		String name= ptm.getaccholder_name();
		float balance = ptm.getBalanace();
		
	
	System.out.println(no);
	System.out.println(name);
	System.out.println(balance);
	}

}
