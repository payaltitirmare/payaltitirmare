package com.codeo.CodingPractice;

import java.util.Scanner;

public class CodingPractice {

	//print the sequence  x*1+ x*3+ x*5+ x*7........n 
	
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("enter first number");
	       int n1 = sc.nextInt();
	       System.out.println("enter second number");
	       int n2 = sc.nextInt();
	       
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("after ");		
        System.out.println(n1+"   "+n2);		
}
		
}