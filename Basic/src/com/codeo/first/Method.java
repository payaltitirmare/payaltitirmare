package com.codeo.first;

public class Method {

	int a = 10;
	int b =20;
	
	void addition()
	{
		int c ;
		
		c=a+b;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		
		Method m = new Method();
		m.addition();
	}
}
