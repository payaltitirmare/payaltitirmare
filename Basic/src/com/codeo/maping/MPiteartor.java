package com.codeo.maping;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MPiteartor {

	public static void main(String[] args) {
	
		Map <Integer ,String> mp = new TreeMap <>();
		
		mp.put(78, "payal");
		mp.put(33, "saurbh");
		mp.put(11, "chirag");
		mp.put(7, "vishkjha");
		
		System.out.println(mp);
		
		for(Map.Entry<Integer, String > ent : mp.entrySet())
		{
			System.out.println(ent.getValue()+"   "+ent.getKey());
		}
		
		
		
	}

}
