package com.codeo.LeetcodePractice;

import java.util.Scanner;

public class CalculateCGPA {

	// calculate cgpa  of students
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int sum =0;
		double marks= 0.0; 
		for (int i=1 ; i <=8 ; i++)
		{
			
		 marks  = sc.nextDouble();	
			
		}
		
		
		System.out.println(marks/8);
		
	   }
     }
