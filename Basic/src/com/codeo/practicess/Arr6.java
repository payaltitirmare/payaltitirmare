package com.codeo.practicess;

public class Arr6 {

	//copy array into new array
	public static void main(String[] args) {
	
		int[] arr = {12,23,44,56,78 };
		
		int [] a = new int[arr.length];
		
		for(int i=0; i<arr.length ;i++)
		{
			a[i]= arr[i];
		}
		
		for(int aa : a)
		{
			System.out.print(aa+"  ");
		}
	}

}
