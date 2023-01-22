package com.codeo.maping;

public class Test {

	public static void main(String[] args) {
		Emp e1 = new Emp(111,"payal");
		Emp e2 = new Emp(222, "usha");
		Emp e3 = new Emp (333, "mayuri");
		Emp[] e = new Emp[5];
		
		e[0]= e1;
		e[2]= e2;
		e[4]=e3;
		/* print the null values and data also 
		for(Object o : e)
		{
			if(o instanceof Emp)
			{
				Emp ee = (Emp)o;
				System.out.println(ee.eid+"----"+ee.ename);
			}
		
			if(o== null)
			{
				System.out.println(o);
			}
		}
		*/
		
		//here i want to print the null indexes 
		
		for(int i=0; i < e.length; i++)
		{
			if(e[i]==null)
			{
				System.out.println(i);
			}
		}
		
		}
	    }
