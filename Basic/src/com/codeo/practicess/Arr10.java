package com.codeo.practicess;

import java.util.ArrayList;

public class Arr10 {

	public static void main(String[] args) {
		
		int[] arr1 = {10,20,9,6,12};
		
		int[] arr2 = {22,33,9,44};
		
ArrayList<String> ar = new ArrayList();
		
		for(int i =0 ; i<arr1.length ; i++)
		{
			for(int j=0;j<arr2.length ; j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
