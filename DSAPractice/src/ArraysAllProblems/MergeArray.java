package ArraysAllProblems;

import java.util.Arrays;

public class MergeArray {

	//write a program to mearge the array 
	
	
	public static void main(String[] args) {
		
		int a[] = {1, 2, 3}; //3
		
		int b[]= { 4, 5, 6};  //3
		
		int c[] = new int[a.length+b.length]; //6  // creating new array of size a+b
		
		for(int i=0; i<a.length; i++)
		{
			c[i]= a [i];  //storing first array into new array 1 2 3 
		}
		
		for(int i=0; i<b.length; i++)
		{
			c[i+ a.length] = b[i];
		}
		

		System.out.println(Arrays.toString(c));
	}

}
