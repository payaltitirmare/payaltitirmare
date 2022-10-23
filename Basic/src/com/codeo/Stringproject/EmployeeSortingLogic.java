package com.codeo.Stringproject;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSortingLogic {

	public static void main(String[] args) {
		
		ArrayList <EmpComparator> al = new ArrayList<> ();
		
		al.add(new EmpComparator(92,"saurabh",50000));
		al.add(new EmpComparator(56,"payal",40000));
		al.add(new EmpComparator(14,"sunil",20000));
		al.add(new EmpComparator(44,"pallavi",25000));
		al.add(new EmpComparator(18,"hushree",15000));
		
		Collections.sort(al , new SallaryCom());
		
		System.out.println(al);
	}

}
