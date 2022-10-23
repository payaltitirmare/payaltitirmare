package com.codeo.CodingPractice;

import java.util.Scanner;

public class MarkSheetFormat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks one by one :");
		
		int English = sc.nextInt();
		int Maths = sc.nextInt();
		int Science = sc.nextInt();
		int total = English + Maths + Science;
		float  percentage = total/3.0f;
	
		
		System.out.println("                     MARKSHEET");
		System.out.println("===================================================");
		System.out.println("subject "+"                          "+"Marks");
		System.out.println("===================================================");
		System.out.println("English                               "+English);
		System.out.println("Maths                                 "+Maths);
		System.out.println("Science                               "+Science);
		System.out.println("===================================================");
		System.out.println("Percentage  "+ percentage+"           "+"total "+total);
		System.out.println("===================================================");
		
		
}
	
}
