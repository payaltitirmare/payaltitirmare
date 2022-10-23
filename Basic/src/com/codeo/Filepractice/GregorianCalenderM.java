package com.codeo.Filepractice;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalenderM {

	// how to print data by using gregorian calender
	
	
	
	public static void main(String[] args) {
		
		int date=0;
		int month=0;
		int year=0;
		int hour=0;
		int minute=0;
		int seconds=0;
		
		Calendar gc = new GregorianCalendar();
		
		 date= gc.get(GregorianCalendar.DATE);
		 month = gc.get(GregorianCalendar.MONTH);
		 year = gc.get(GregorianCalendar.YEAR);
		hour = gc.get(GregorianCalendar.HOUR);
		minute = gc.get(GregorianCalendar.MINUTE);
		 System.out.println(date+"/"+month+"/"+year);
		 System.out.println(hour+":"+minute);
		 
		 
	}

}
