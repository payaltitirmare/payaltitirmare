package com.codeo.dsa_BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args)
	
	{
		System.out.println("enter a number ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num <0)
		{
			System.out.println("invalid number please enter again..");
		}
		else
		{
			Practice pt = new Practice();
			int fact = pt.getanswer(num);
			if(fact==num)
			{
				System.out.println(num+" is a perfect number....");
			}
			else
			{
				System.out.println("it is not perfect number");
			}
			}
			
		}
		
	
	public int getanswer(int num)
	{
		int fact=0;
		for(int i=1; i<num; i++)
		{
			if(num%i==0)
			{
				fact = fact +i;
			}
		}
		
		return fact ; 
	}

	
}
