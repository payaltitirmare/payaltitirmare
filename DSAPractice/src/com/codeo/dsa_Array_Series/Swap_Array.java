package com.codeo.dsa_Array_Series;

import java.util.Arrays;

public class Swap_Array {

	public static void main(String[] args) {
		
		//swap array
		
                  //0 1 2 3  4    		
		int[] arr= {1,2,5,14,18};
		
		swap(arr,0,4);
		
		System.out.println(Arrays.toString(arr));
	}
	
	private static void swap(int[] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] =temp;
		
	}

	
}
