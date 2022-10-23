package com.codeo.assignment2;

public class RemoveDuplicateunsortedArray {

	//remove duplicates from array 
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,23,45,23,3,2,4,4,5};
		//int n = arr.length;
		
		for(int i=0 ;i<arr.length ; i++)
		{
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[i]> arr[j])
				{
					arr[i] = arr[i]+arr[j];
					arr[j] = arr[i]-arr[j];
					arr[i] = arr[i]-arr[j];
				}
			}
		}
		
		int narr= removeDuplicate(arr);
        
		for(int i=0;i<narr;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

	private static int removeDuplicate(int[] arr) {
		
		int j=0;
		
		for(int i=0;i< arr.length-1; i++)
		{
			if(arr[i]!= arr[i+1])
			{
				arr[j] = arr[i];
				j++;
			}
		}
		
		arr[j++] = arr[arr.length-1];
		
		return j;
	}

}
