package com.codeo.LeetcodePractice;

import java.util.Arrays;

public class FindPrefix14 {

	// Longest Common Prefix  -- watch video from technosage

	public static void main (String[] args)
	{
		              //   0        1       2  
		String[] strs = {"pa","rt","eweww"};
		
		String ans = longestCommonPrefix(strs);
		
		System.out.println(ans);
	}
	
    public static String longestCommonPrefix(String[] strs) {
        
    	Arrays.sort(strs);  // we sort beacuse if this are sorted then
    	//in first string common prefix and last string common prefix also occur in middale string common prefix 
       
    	
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
