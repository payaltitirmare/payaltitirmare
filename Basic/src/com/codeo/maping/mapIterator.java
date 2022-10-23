package com.codeo.maping;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class mapIterator {

	public static void main(String[] args) {
	
		//hashmap , linkedhamap , treemap 
		
		Map <Integer, String> hm = new TreeMap<>();
		
		hm.put(23, "payal");
		hm.put(12, "saurabh");
		hm.put(34, "mayuri");
		hm.put(45, "chirag");
		
		System.out.println(hm);
	
		System.out.println(hm.containsKey(12));
		System.out.println(hm.containsValue("payal"));
	
		System.out.println(hm.keySet());
		
		System.out.println(hm.values());
          
		for(Map.Entry<Integer, String> entry : hm.entrySet())
		{
			System.out.println("values :"+entry.getKey());
		}
	
	}

}
