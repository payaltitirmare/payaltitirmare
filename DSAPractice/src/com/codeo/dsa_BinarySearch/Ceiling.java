package com.codeo.dsa_BinarySearch;

public class Ceiling {

	public static void main(String[] args) {
		// ceiling of number means find the number which is greater than the target number.....
		          // 0 1 2 3 4  5  6 
		int[] arr = {2,3,5,9,14,16,18};
		int target = 7;
		Ceiling cl = new Ceiling();
		int ans = cl.ceiling(arr, target);
		
        System.out.println(ans);
	}
	
	//  return the index of smallest no >= target
	
	 int ceiling(int[] arr, int target)
	{
		 // but what if the target is greater than the greatesr number in the array
		 
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
		
		return start;
	}

}
