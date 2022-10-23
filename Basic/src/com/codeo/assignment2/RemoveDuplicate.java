package com.codeo.assignment2;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,4};
	
		int n = arr.length;
		int nlen = removeduplicate(arr, n);
	
		for(int i =0; i<nlen ;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private static int removeduplicate(int[] arr, int n) {
	
		int j=0;
		
		for(int i=0 ;i<n-1; i++)
		{
			if(arr[i]!= arr[i+1])
			{
				arr[j] = arr[i];
				j++;
			}
		}
		
		arr[j++] = arr[n-1];
		
		return j;
	}
	
 }
