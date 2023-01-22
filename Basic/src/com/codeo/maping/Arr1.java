package com.codeo.maping;

public class Arr1 {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50 };
		//sum of array 
	 int sum = 0;
	 for(int aa : a)
	 {
		sum = sum+aa;
	 }
		System.out.println("sum of array is :"+ sum);
		
	// greater element 
		int max=a[0];
		for (int i=1 ; i< a.length ; i++)
		{
			if(a[i]> max)
			{
				max= a[i];
			}
		}
		System.out.println("greater element is :"+ max);
		// smaller element 
		int min =a[0];
		for(int i= 1 ; i< a.length ; i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		System.out.println("smaller element is :"+ min);
		
		
	}}
