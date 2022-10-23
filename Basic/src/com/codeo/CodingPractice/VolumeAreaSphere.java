package com.codeo.CodingPractice;

import java.util.Scanner;

public class VolumeAreaSphere {

	//convert a temprature reading in degrees faherenheit to degree celsius using the formula c=(5/9) *(f-32)
	
		public static void main(String[] args) {

			//volume of speher = v= (4/3)pi r3 & area of speare = a=4 pi r2
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter the radius of spere :");
			int r = sc.nextInt();
			
			double v = (4/3)*Math.PI*r*r*r;
			double a = 4 *Math.PI*r*r;
			
			System.out.println("volume is :"+v);
			System.out.println("area is :"+a);
					
	}

}
