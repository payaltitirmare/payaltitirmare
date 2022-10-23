package com.codeo.Filepractice;

import java.util.Scanner;

// String is palindrome or not --> 1221 "payap" equal from both side 
//armstrong --> number digits uska power krke unka plus jitta ta utta digit ke equal ane ko hona tabi 
//fibonacci series --> 0 1 1 2 3 5 8 13 
// prime number -- >  no is not divisble by any other number 
// leap year --> 4 & 400 divisble but not by 100

public class Leapyear1 {

	
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the year ");
	int year = sc.nextInt();
	
	if(year%400==0)
	{
		System.out.println("year is leap");
	}
	else if(year%100==0)
	{
		System.out.println("year is not  leap");
	}
	
	else
	{
		System.out.println("it is leap year");
	}
}
}