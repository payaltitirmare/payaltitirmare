package allStringProblems;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		
		//sort the string without using sort method
		
		String name="saurabh";
		char temp;
		char[] arr= name.toCharArray();
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j] )
				{
					 temp = arr[i];
					 arr[i] = arr[j];
					 arr[j]= temp;
					
				}
			}
				
		}
       
		System.out.println(Arrays.toString(arr));
	}

}
