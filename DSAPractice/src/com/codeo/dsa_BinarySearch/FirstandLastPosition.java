package com.codeo.dsa_BinarySearch;

import java.util.Arrays;

public class FirstandLastPosition {

	public static void main(String[] args) {
		           // 0 1 2 3 4 5 6 7 8      binary search problem    
		int[] nums = {5,7,7,7,7,7,8,8,10};  // 1, 5
		int target = 7;
        
		int[] solution = searchRange(nums, target);
		System.out.println(Arrays.toString(solution));
	}

	static int[] searchRange(int[] nums, int target)
	{
		int[] ans = {-1, -1};
		
		int start= search (nums,  target, true);
		int end = search(nums, target, false);
		
		ans[0]= start;
		ans[1]= end;
		
		return ans;
	}
	
	static int search(int[] nums, int target, boolean findstartIndex)
	{
		int ans =-1;
		int start =0;
		int end =nums.length-1;
		
		while (start<= end)
		{
			int mid = start+ (end- start)/2;
			
			if(target < nums[mid])
			{
				end = mid-1;
			}
			else if(target > nums[mid])
			{
				start = mid+1;
			}
			else
			{
				//potential ans found
				ans = mid;
				
				if(findstartIndex)
				{
					end = mid-1;
				}
				else {
					start = mid+1;
				}
			}
		}
		
		return ans;
	}
}
