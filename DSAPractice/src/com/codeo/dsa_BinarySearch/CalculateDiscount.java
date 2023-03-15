package com.codeo.dsa_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateDiscount {

	public static void main(String[] args) {
		
		// Count the Number of Vowel Strings in Range
		
	String[]	words = {"ooo","hey","aeo","mu","ooo","artro","aeo","iii"};
		int left =0; 
		int right=7;
	int count =0;
	
	
	
		for(int i=left; i <=right; i++) 
		{
			//char d=words[i].charAt(words[i].length()-1);
	           
			char c= words[i].charAt(0);
			char d = words[i].charAt(words[i].length()- 1);
			
		if ( (c=='a'||c== 'i'||c== 'e'||c== 'o' ||c=='u') && (d=='a'||d== 'i'||d== 'e'|| d=='o' ||d=='u'))
			
			{
				count ++;
			}
		}
		
		System.out.println(count);
	   }
    }
