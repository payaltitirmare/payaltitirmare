package com.codeo.Stringproject;

import java.time.LocalDate;
import java.time.Month;

public class Daysss {

	
	public static void main(String[] args) {
	                  
		  String date = "2020-07-18";
		  
		  gatedayMonth(date);
		
	}

	private static void gatedayMonth(String date) {
		
		
		LocalDate currentDate = LocalDate.parse(date);
		
		int day = currentDate.getDayOfMonth();
		
		Month month = currentDate.getMonth();
		
		int year = currentDate.getYear();
		
		System.out.println(day +" "+month +" "+ year);
		
	}

}
