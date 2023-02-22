package com.codeo.codesdope;

import java.util.Scanner;

public class Practice {

	
	// reverse the array
	
	public void Reverse(int num)
	{
		int temp =num, rem;
		
		while(num!=0)
		{
			rem= num%10;
			
			System.out.print(rem);
			
			num=num/10;
			
		} }
	
	public static void main(String[] args)
	{
		Practice p = new Practice();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the name");
		
		int num=sc.nextInt();
		
		p.Reverse(num);
		
		//System.out.println(p.Reverse(name));
		
		 int arr[]= {22,44,78};
		
		
	}
	
  }
