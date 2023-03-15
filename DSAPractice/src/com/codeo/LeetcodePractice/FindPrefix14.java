package com.codeo.LeetcodePractice;

import java.util.Arrays;

public class FindPrefix14 {

	

	public static void main (String[] args)
	{
		              //   0        1       2  
		String[] strs = {"pa","rt","eweww"};
		
		String ans = longestCommonPrefix(strs);
		
		System.out.println(ans);
	}
	
    public static String longestCommonPrefix(String[] strs) {
        
    	Arrays.sort(strs);
        String start = strs[0];
        String end = strs[strs.length-1];
        int idx = 0;
       
        while(idx < start.length() && idx < end.length()){
        	
            if(start.charAt(idx) == end.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return idx==0?"":start.substring(0, idx);
    }
	
}
