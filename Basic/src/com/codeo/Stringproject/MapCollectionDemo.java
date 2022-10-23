package com.codeo.Stringproject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapCollectionDemo {

	public static void main(String[] args) {
		
		
		HashMap <Integer,Character> hm = new HashMap<>();
		
		hm.put(67, 'c');
		hm.put(45, 'y');
		hm.put(88, 'p');
		hm.put(23, 's');
		
		System.out.println(hm);
	
		 
		 for( Map.Entry<Integer, Character> entry : hm.entrySet()) {
			 
			 System.out.println("key : "+ entry.getKey()+"  "+"value : "+entry.getValue());
		 }
		 
	}
	
	

}
