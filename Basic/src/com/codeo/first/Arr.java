package com.codeo.first;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Arr {

	
	public static void main(String[] args) {
	
		int total_marks=256;
		float percentage;
		float per;
		float average;
	
		percentage=(total_marks*100)/300;
		
		
		per = total_marks/300.0f*100;
		
		average = total_marks/3.0f;
		
		System.out.println(percentage);
		System.out.println(average);
	
		DecimalFormat decimalformat = new DecimalFormat("#.##");
		
		float twoDigitsF = Float.valueOf(decimalformat.format(average));
		
	System.out.println("percentages :"+String.format("%.2f", per));
		
		System.out.println(twoDigitsF);
		System.out.println("new per is: "+per);
	
}
}