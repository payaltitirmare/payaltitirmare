package com.codeo.first;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class CurrentDateC {

	public static void main(String[] args) {
		
		String date ="2001-10-30";
		
		Date d = new Date();
		
		System.out.println(d);
		
		LocalDate time = LocalDate.parse(date);
		
		int day = time.getDayOfMonth();
		
		Month month = time.getMonth();
		
		int year = time.getYear();
		
		System.out.println(day+"-"+month+"-"+year);
	}

}
