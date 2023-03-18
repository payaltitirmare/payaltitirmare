package com.codeo.LeetcodePractice;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		//find product of the number 
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int power = sc.nextInt();
		int c=0; 
		int prod = 1;
		while (c != power)
		{
			prod = prod * num;
			c++;
		}
		
		System.out.println(prod);
	}

}
