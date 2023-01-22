package com.codeo.practicess;

import java.util.ArrayList;

public class Arr9 {

	public static void main(String[] args) {
		
		String[] str = {"payal" , "radhe", "saurabh"};
		
		String[] s = {"usha","titir","mayuri","saurabh","hha"};
		
		ArrayList<String> ar = new ArrayList();
		
		for(int i =0 ; i<str.length ; i++)
		{
			for(int j=0;j<s.length ; j++)
			{
				if(str[i].compareTo(str[j])==0)
				{
					ar.add(str[i]);
				}
			}
		}
		System.out.println(ar);
	}

}
