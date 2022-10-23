package com.codeo.Stringproject;

import java.util.ArrayList;
import java.util.Collections;

public class Sortinglogic {

	public static void main(String[] args) {

		
		ArrayList <Student> al = new ArrayList<>();
		
		al.add(new Student(90,"payal" , 121));
		al.add(new Student(67,"saurabh" , 678));
		al.add(new Student(34,"mayuri" , 999));
		al.add(new Student(55,"chirag" , 441));

		Collections.sort(al , new NameComparator());
		
		System.out.println(al);
		
	}

}
