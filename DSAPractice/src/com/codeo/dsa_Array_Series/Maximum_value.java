package com.codeo.dsa_Array_Series;

public class Maximum_value {

	public static void main(String[] args) {
		// write a code to find maximum value of an array
		         // 0 1 2  3  4  5    
		int[] arr= {1,3,23,33,88,9,18};
		
		System.out.println(maximum(arr));

		System.out.println(maxRange(arr,0,3));
		
	}
	
	static int maxRange(int[] arr, int start, int end)
	{
	int max= arr[start];
	
		for(int i= start; i<= end ; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		return max;
	}
	
	static int maximum(int[] arr)
	{
		int max=arr[0];
		for(int i=1 ;i<arr.length; i++)
		{
			if(arr[i]> max)
			{
				max = arr[i];
			}
		}
		
		return max;
	}

}
