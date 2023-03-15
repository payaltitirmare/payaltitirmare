package com.codeo.dsa_LinearSearch;

public class MinimumNumber {

	public static void main(String[] args) {
		
		int arr[] = {18, 12, 7, 3, 14};
		
		System.out.println(findMinimumNumber(arr));

	}
	static int findMinimumNumber(int[] arr)
	{
		if(arr.length==0) 
			return -1;
		
		int min= arr[0];
		
		for( int i=1; i<= arr.length-1 ; i++)
		{ 
			if(arr[i]<min)
			{
				min= arr[i];
			}
			}
    	return min;
	}

}
