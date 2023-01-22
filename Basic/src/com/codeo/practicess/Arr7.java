package com.codeo.practicess;

import java.util.Arrays;

public class Arr7 {

	//insert an element into an array
	
	public static void main(String[] args) {
	
		int[] arr = {10, 20 , 30 , 50, 60};
		int add_index =0;
		int newvalue= 40;
		
		for(int i= arr.length-1; i> add_index ; i--)
		{
			arr[i] = arr[i-1];
			
		}
		arr[add_index] = newvalue;
		System.out.println(Arrays.toString(arr));
	}

}
