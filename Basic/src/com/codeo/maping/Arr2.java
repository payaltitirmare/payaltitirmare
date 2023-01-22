package com.codeo.maping;

public class Arr2 {
//solve this question -- print the even data and odd data in different array
	public static void main(String[] args) {
		
		String [] s = new String [5];
		s[0] ="aaa";
		s[1]="bbb";
		s[2]= "ccc";
		s[3]="ddd";
		s[4]="eee";
		String [] s1 = null;
		for(int i=0; i<s.length;i++)
		{
			if(s.length %2==0)
			{
				 System.out.println(s[i]);
			}	}
		
	}

}
