package com.codeo.dsa_BinarySearch;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		System.out.println("enter a number ");
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		if(input <=0)
		{
			System.out.println("invalid number....!!!!!!");
		}
		else
		{
			for(int i=1; i<input; i++)
			{
				int result = findFactors(i);
				if(i == result)
				{
					System.out.println(result);
				}
			}
		}
	}
	
	public static int findFactors(int input )
	{ 
		int fact=0;
		for(int i=1; i<input; i++)
		{
			if(input % i==0)
			{
				fact = fact+i;
			}
			
		}
		return fact;
	}
}
