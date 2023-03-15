package com.codeo.dsa;

import java.util.Scanner;

public class UpperCaseOrLowerCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char s = sc.next().trim().charAt(0);
		
		System.out.println(s);
		
		if(s >= 'a' && s <='z'  )
		{
			System.out.println("lowercase");
		}
		else
		{
			System.out.println("uppercase");
		}
		
		
		//fibonacci series
		
		int a=0, b=1, c=0;
		
		
		for(int i=0;i<7 ;i++)
		{
			
			System.out.print(a);
			a=b;
			c=a+b;
			b=c;
			
		}
		
	}

}
