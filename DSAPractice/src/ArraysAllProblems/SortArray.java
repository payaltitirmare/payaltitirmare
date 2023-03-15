package ArraysAllProblems;

import java.util.Arrays;

public class SortArray {

	// write a java program to sort an array
	
	
	public static void main(String[] args) {
		int arr[] = {4, 2, 3, 1} ;
		int temp=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					//arr[i]= arr[i]+arr[j];   // 1st approach
					//arr[j] = arr[i]- arr[j];
					//arr[i]= arr[i]- arr[j];
					
					temp = arr[i];    // 2nd approach 
					arr[i] =arr[j];
					arr[j] = temp;
				}
			}
		}
		
   System.out.println("this"+ Arrays.toString(arr));
		
	}

}
