package com.codeo.dsa_LinearSearch;

import java.util.Arrays;

public class SearchInString {

	public static void main(String[] args) {
		// searcg in a string an alphabet is present or not
		
		String str = "payaldi";
		char target='a';
		
		System.out.println(Arrays.toString(str.toCharArray()));
		char[] n = str.toCharArray();
		
		System.out.println(SearchString(str,target));

	}
	static boolean SearchString(String str, char target)
	{
		if(str.length()==0)
		{
			return false;
		}
		
		for(char ch: str.toCharArray() )
		{
			if(ch== target)
			{
				return true;
			}
		}
		
		return false;
	}
  }
