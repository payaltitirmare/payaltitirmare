package com.codeo.practicess;

public class Arr4 {

	public static void main(String[] args) {
		//average value of array element 
		
		int [] arr = {10,20,30,40,50};
		int sum = 0;
		int avg ;
		
		for(int i=0; i< arr.length ; i++)
		{
			 sum = sum+arr[i];
		}
		
		avg = sum/arr.length;
		
		System.out.println("average of elements is :"+ avg);
	}

}
