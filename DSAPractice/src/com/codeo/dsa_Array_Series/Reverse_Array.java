package com.codeo.dsa_Array_Series;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		// reverse the given array 
		int[] arr = { 1, 3, 23, 9, 18 }; 
        revers (arr);
        System.out.println(Arrays.toString(arr));
	}

	static void revers (int[] arr)
	{
		int start= 0;
		int end = arr.length-1 ;
		
		while(start < end)
		{
			swap (arr, start, end);
			start++;
			end--;
		}
	}

	private static void swap(int[] arr, int start, int end) {
		
		    int temp= arr[start]; 
			arr[start]= arr[end]; 
			arr[end] = temp;    
			
			
		  // arr[start] = arr[start+ end ];
		   //arr[ end] = arr[start- end];
		   //arr[start] = arr[start- end];
		}
	
}
