package com.codeo.LeetcodePractice;

public class Demo {

	public static void main(String[] args) {
		//  Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
		// determine if the input string is valid. 

	String str = "()";
		
	System.out.println(isvalid(str));
		
	
	}

	static boolean isvalid(String str)
	{
		for ( int i=0; i< str.length(); i++)
		{
			for(int j= 1 +i; j< str.length(); j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					return true;
					
				}
			}
		}
		   return false;
	}
  }
