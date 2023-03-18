package com.codeo.dsa_BinarySearch;

public class Floor {

	public static void main(String[] args) {
		// find floor  means the greatest number which is smallar than the target
		           //0  1  2  3  4   5    6
		int[] arr = {2, 3, 5, 9, 14, 16, 18 };
		int target = 14;
		int ans = floor(arr, target);
		System.out.println(ans);
		
	}
  
	static int floor(int[] arr, int target)
		{  // but what if the target is greater than the greatesr number in the array
			
		if(target > arr[arr.length-1])
			 {
				 return -1;
			 }
			 
			 int start =0;
			int end = arr.length-1;
			
			while (start <= end)
			{
				int mid = start + (end - start)/2;
				
				if(target < arr[mid])
				{
					end = mid -1;
				}
				else if (target > arr[mid])
				{
					start  = mid +1;
				}
				else {
					return mid;
				}
			}
			   return end;
		}
    }