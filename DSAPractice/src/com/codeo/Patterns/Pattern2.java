package com.codeo.Patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter how many rows do you want :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		FindPattern(n);
	}

	static void FindPattern(int n)
	{
		for(int i =1; i<=n; i++)
		{
			for(int j= n; j>=i ; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
