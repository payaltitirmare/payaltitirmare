package com.codeo.Stringproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
	
	
	int age =0;
	 String name= null;
	 int rollno = 0;
	
	 
	 @Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", rollno=" + rollno + "]";
	}


	public Student(int age, String name, int rollno) {
			super();
			this.age = age;
			this.name = name;
			this.rollno = rollno;
		}
	 
}
