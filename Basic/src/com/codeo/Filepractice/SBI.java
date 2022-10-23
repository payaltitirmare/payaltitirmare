package com.codeo.Filepractice;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class SBI {
// pin , balance withdrew, ---name,total blance,time date
	
	int atm_pin;
	int total_balance;
	int withdraw_balance;
	String name;
	int date,month,year;
	int hour,minute,seconds;
	
 	static {
		System.out.println("welcome to SBI bank............ ");
	}
 	Scanner sc= new Scanner(System.in);
 	
 	public SBI(int atm_pin, int total_balance, String name) {
		super();
		this.atm_pin = atm_pin;
		this.total_balance = total_balance;
		this.name = name;
	}

	void Accountdetails() 
	{
		System.out.println("enter your pin");
		int pin = sc.nextInt();
		System.out.println("enter withdraw balance");
		withdraw_balance = sc.nextInt();
		
		try {
			
		if(pin==atm_pin)
		{
			System.out.println("congratulation you login Succefully");
			System.out.println("welcome Mr/Miss "+name+"in sbi");
			
			
			if(withdraw_balance >total_balance)
			{
				throw new IllegalActivity();
			}
			else
			{
				total_balance=total_balance-withdraw_balance;
				System.out.println("your rest balance is: "+total_balance);
			}
		}
		else
		{
			System.out.println("Sorry, please enter valid pin code ");
			
		}
	}
		catch(IllegalActivity e1)
		{
			e1.printStackTrace();
		}
		finally {
			
			Calendar gc= new GregorianCalendar();
			date = gc.get(GregorianCalendar.DATE);
			month = gc.get(GregorianCalendar.MONTH);
			year = gc.get(GregorianCalendar.YEAR);
			
			System.out.println(date+"/"+month+"/"+year);
		}
	}
	
	public static void main(String[] args) {
	
		SBI sbi= new SBI(1212,3000,"payal");
		
		sbi.Accountdetails();
		
	}

}
