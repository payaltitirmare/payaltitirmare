package com.codeo.practicess;

public class Arr2 {

	public static void main(String[] args) {
		
		//sort the string 
		String[]  str = {"payal" ,"mayuri","asha","usha","vishu"};
		String temp=null;
		for(int i =0; i<str.length; i++)
		{
			for(int j=i+1; j<str.length;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					temp= str[i];
					str[i]= str[j];
					str[j]= temp; 
					
				}
			}
			
		}
		for(String s :str)
		{
			System.out.print(" ,"+s);
		}
	}

}
