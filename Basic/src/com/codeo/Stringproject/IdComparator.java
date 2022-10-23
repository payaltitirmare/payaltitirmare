package com.codeo.Stringproject;

import java.util.Comparator;

public class IdComparator implements Comparator<EmpComparator> {

	@Override
	public int compare(EmpComparator o1, EmpComparator o2) {
		
		return o1.id- o2.id;
	}

}
