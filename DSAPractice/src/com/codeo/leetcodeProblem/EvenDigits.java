package com.codeo.leetcodeProblem;

public class EvenDigits {

	public static void main(String[] args) {
		
		int nums[] = {12, 345, 2, 6, 7896};

		System.out.println(FindNumber(nums));
	}

	static int FindNumber(int[] nums)
	{
		int count =0;
		
		for(int num : nums)
		{
			if(Even(num))
			{
			count++;	
			}
		}
		
	return count;
	}
	
	 static boolean Even(int num) {
		
		int numberOfDigit = digits(num);
		if(numberOfDigit %2==0)
		{
			return true;
		}
		
		return false;
	}

	static int digits(int num)
	{
		int count=0;
		if(num <0)
		{
			num= num * -1;
		}
		
		if(num ==0 )
		{
			return 1;
		}
		
		while( num > 0)
		{
			count++;
			num = num/10;
		}
		return count;
	}
 }
