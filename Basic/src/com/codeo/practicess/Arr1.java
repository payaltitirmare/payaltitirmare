package com.codeo.practicess;

public class Arr1 {

	public static void main(String[] args) {
		
		//sort the numeric array
		int[] a= {10,2,3,45,31,1};
		System.out.println("array in soted order is :");
		for(int i=0 ; i<a.length ; i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					a[i] = a[i]+a[j];
					a[j]= a[i]-a[j];
					a[i]= a[i]-a[j];
				}
			}
		}
	
		for(int i:a) {
			System.out.print(" , "+i);
		}
	}

}
