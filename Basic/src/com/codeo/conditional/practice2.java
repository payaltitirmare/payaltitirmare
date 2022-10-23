package com.codeo.conditional;

import java.util.Scanner;

public class practice2 {

	// -b +-  b2 - 4 ac/ 2a 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		
		double a = sc.nextDouble();
		System.out.println("enter the number");
		
		double b = sc.nextDouble();
		System.out.println("enter the number");
		
		double c = sc.nextDouble();
		
	isQuadraticequation ( a , b ,c);
	
	}

	public static void isQuadraticequation(double a, double b, double c) {
		
		double d = b * b - 4.0 * a* c;
		
		if(d > 0.0)
		{
			double r1 = (-b + Math.sqrt(d))/(2.0 * a);
			double r2 =( -b - Math.sqrt(d))/(2.0 * a);
		System.out.println("the root are "+ r1 +" and  "+ r2);	
		}
		else if(d ==0.0)
		{
			double r1 = -b / (2.0 * a);
			System.out.println("root is :"+r1);
		}
		else
		{
			System.out.println("the equation has no real root");
		}
		
	}

	
	
}
