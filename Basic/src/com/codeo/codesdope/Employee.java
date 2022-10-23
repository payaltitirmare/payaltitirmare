package com.codeo.codesdope;

import java.util.Scanner;

public class Employee {

   String name = null;
    String address = null;
    int year_of_joining = 0;
    int sallary=0;
    
	
	//public Employee(String name, int year_of_joining, int sallary, String address) {
		
		//this.name = name;
	//	this.year_of_joining=year_of_joining;
		//this.address= address;
	//	this.sallary= sallary;
	//}

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.getemploye("robert", 1994 , 64 ,"c-WallsStreat");
		emp.getemploye("sam", 2000 , 68 ,"D-WallsStreat");
		emp.getemploye("john", 1999 , 26 ,"B-WallsStreat");
	}


	private void getemploye(String name, int year_of_joining, int sallary, String address) {
		
		System.out.println(name +" "+year_of_joining+ " "+address+" "+sallary);
		
	}
	

}
