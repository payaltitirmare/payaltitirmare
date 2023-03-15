package com.codeo.dsa_BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		// lets see the  algoritham for binary search 
		//  find first mid value.
		// check the array is in asecending or descending  and apply conditions according to this
                   //0    1     2   3  4  5  6  7   8   9  10   11 
		int[] arr = {-14, -12, -10, 0, 2, 4, 8, 16, 22, 42, 67, 87}; 
		
		int target = 22;
		int ans = binarysearch(arr, target);
		
		System.out.println(ans);
	}

	static  int binarysearch(int[] arr, int target)
	{
		int start= 0;
		int end = arr.length-1;
		
		while(start <= end)
		{
			int mid= start+ (end- start)/2;
			if(target < arr[mid])
			{
				end = mid-1;
			}
			else if(target > arr[mid])
			{
				start = mid+1;
			}
			else
			{
				return mid;
			}
		}
			
		return -1;
	}
}
