package com.codeo.dsa_BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		//Input: strs = ["flower","flow","flight"]
		//Output: "fl"  longest common prefix 
		
		String [] strs= {"flower","flow","flight"};
		
		String ans = commonprefix(strs);
	
		System.out.println(ans);
	  }
	
	
	static String commonprefix (String [] strs)
	{
		Arrays.sort(strs);
		  String s1 = strs[0];
	        String s2 = strs[strs.length-1];
	        int idx = 0;
	        
	        while(idx < s1.length() && idx < s2.length()){
	            if(s1.charAt(idx) == s2.charAt(idx)){
	                idx++;
	            } else {
	                break;
	            }
	        }
	        return s1.substring(0, idx);
	    }
		
}
