package com.codeo.Stringproject;

import java.io.PrintStream;

public class Person {

	
		int age;
		  String name;
		  
		  public Person (int age , String name)
		  {
			System.out.println("ia am constructor");
		  }
		  
		  public static void main(String [] args) {
		    // creates a new Person object
			  System.out.println("i am main");
			  
		    Person p = new Person( 56 , "saurabh"); 
		   
		   
	}

}
