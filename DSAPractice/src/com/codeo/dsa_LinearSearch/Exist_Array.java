package com.codeo.dsa_LinearSearch;

public class Exist_Array {

	public static void main(String[] args) {
		// find array is exist or not 
		        // 0   1   2  3  4   5  6   7  8  9
	int arr[] = { 18, 12, 9, 14, 77, 50 ,45,89,12,11};
	
		//int arr[] = {};
	int  target= 186;
	 System.out.println(Find(arr,target));
	  
	}
	
	static int Find(int[] arr, int target)
	{
		if(arr.length==0)
		{
			return -1;
		}
		 boolean exist= false;
		 
		 for(int a: arr)
		 {
			if(a== target)
			{
				return 1;
			}
		 }
		
		return -1;
	}

}
