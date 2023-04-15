package com.codeo.dsa_BinarySearch;

public class SmallestLetter744 {

	public static void main(String[] args) {
		// Find Smallest Letter Greater Than Target

		char[] letters = {'x','x','y','y'};
	     char target = 'z';
	     char ans = nextGreatestLetter( letters, target);
	      System.out.println(ans);
		
	}
	
	 public static char nextGreatestLetter(char[] letters, char target) {
	        
		 int start = 0;
		 int end = letters.length-1;
		  
		 while (start <= end)
		 { 
			 int mid = start + (end -start)/2;  // 0+2 /2 =1  
		  
			 if( target < letters[mid] )
			 {
				 end = mid -1;
			 }
			 else  {
				 start = mid +1;
			 }
		 }
		  
		 return letters[start % letters.length];
  }

}
