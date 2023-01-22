package com.codeo.practicess;

import java.util.Arrays;

public class Arr11 {

	public static void main(String[] args) {
		int[] a = {11,22,33,44,33,55};
		 System.out.println(a[a.length-3]);
		int len = a.length;
		
		for(int i=0 ; i<len; i++)
		{for(int j= i+1; j<len; j++)
			{
			if(a[i]==a[j])
				{
				a[i]=a[i-1];
				len--;
				j--;
					}}}
		int[] arr1 = Arrays.copyOf(a, len);
	
		for(int i=0; i<arr1.length ; i++)
		{
			System.out.println(arr1[i]+" ");
		}
	}

}
