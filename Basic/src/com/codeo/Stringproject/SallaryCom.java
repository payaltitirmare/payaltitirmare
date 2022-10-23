package com.codeo.Stringproject;

import java.util.Comparator;

public class SallaryCom implements Comparator<EmpComparator> {

	@Override
	public int compare(EmpComparator o1, EmpComparator o2) {
		
		return o1.sallary - o2.sallary;
	}
	
	

}
