package com.codeo.dsa_LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		// search element in 2d  array
		
		int[][] arr= {
				{23, 4, 1 },
				{18, 12, 3, 9 },
				{78, 99,34,56},
				{18,17} 
			};
		
		int target= 17;
		int [] ans= SearchArray(arr, target);
		System.out.println(Arrays.toString(ans));

	}
	static int[] SearchArray(int[][] arr, int target)
	{
		
		for(int row=0; row < arr.length; row++)
		{
			for(int col=0; col < arr[row].length; ++col)
			{
				if(arr[row][col]==target)
				{
					return new int[] {row,col} ;
				}
			}
		}
		
		return new int[] {-1,-1};
	}
}
