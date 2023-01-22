package com.codeo.practicess;

import java.util.Arrays;

public class Arr5 {

	//arrays contain a specific value 
	public static void main(String[] args)
	{
		int[] value = {25, 14, 56, 36, 56, 77, 18, 29, 49};
		
		int remove_index = 1;
		
		for(int i= remove_index ; i <value.length -1 ; i++)
		{
			value[i] = value[i+1];
			}
	System.out.println("the new arrays are "+Arrays.toString(value));	
	
	}
}
