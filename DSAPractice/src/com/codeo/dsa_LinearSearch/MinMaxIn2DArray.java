package com.codeo.dsa_LinearSearch;

public class MinMaxIn2DArray {

	public static void main(String[] args) {
		// find minimum and maximum value form an array
		
		int[][] arr= {
				{23, 4, 1 },
				{18, 12, 3, 9 },
				{8, 9,34,56},
				{18,17} 
			};
		System.out.println(max(arr));
		

	}
	static int max(int[][] arr)
	{
		int max= arr[0][0];  //Integer.MIN_VALUE;
		
	//	for(int row=0; row <arr.length; row++)
		//{
//			for(int col=0; col < arr[row].length; col++)
//			{
//				if(arr[row][col]> max)
//				{
//					max= arr[row][col];
//				}
//				
//			}
			
			// inhanced for loop
			for(int[] a : arr)
			{
				for(int element : a)
				{
					if(element > max)
					{
						max= element;
					}
				}
			}
		//}
		
		return max;
	}

}
