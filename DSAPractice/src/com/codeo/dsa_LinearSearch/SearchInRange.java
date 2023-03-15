package com.codeo.dsa_LinearSearch;

public class SearchInRange {

	public static void main(String[] args) {
		// search in a particular range 
		
		int arr[] = {18, 12, -7, 3, 14};
		int start= 1;
		int end= 4;
		int target=3456;
		
		System.out.println(searchRange(arr,start,end,target));
		 }
	
	static int searchRange(int[] arr, int start, int end, int target)
	{
		if(arr.length==0)
		{
			return -1;
		}
		
		for(int i= start; i<=end; i++)
		{
			if(arr[i]== target)
			{
				return i;
			}
			
		}
		
		return -1;
	}
	

}
