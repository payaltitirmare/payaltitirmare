package ArraysAllProblems;

import java.util.Arrays;

public class FindMaxMin {

	// find the maximum and minimum
	
	public static void main(String[] args) {
		
		int a[] = {4, 1, 7, 10 , 8 };
		
		int min=a[0];
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]< min)
			{
				min = a[i];
			}
			     if( a[i] > max)
			   {
				max = a[i];
			   }
		}
		
		System.out.println(min +" "+ max);
		
		//2nd approach to find this 
		int temp =0;
		for (int i =0; i <a.length; i++)
		{
			for (int j =i+1 ; j<a.length; j++)
			{
			  	if(a[i]> a[j])
			  	{
			  		temp = a[i];
				  	a[i]= a[j];
				  	a[j] = temp;
			  	}
			}
		}
		System.out.println(Arrays.toString(a));
		
		System.out.println(a[0]);   // minimum
		System.out.println(a[a.length-1]);  // maximum
		System.out.println(a[a.length-2]);  // second largest 
		
	}

}
