package com.codeo.practicess;

import java.util.Arrays;

public class Arr8 {

	//find maximum and minimum
	//reverse array 
	//duplicate values  of an array is 

	public static void main(String[] args) {
		
		int[] arr = {10,20,50,30,40,10,20,50,60,60,66,66};
		
		for(int i=0; i<arr.length ; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
		}}
