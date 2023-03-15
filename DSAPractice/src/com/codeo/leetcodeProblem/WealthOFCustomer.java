package com.codeo.leetcodeProblem;

public class WealthOFCustomer {

	public static void main(String[] args) {
		// find the richest person - maximum length of a person 
		
		int[][] accounts = {
//				{1,2,3},
//				{3,2,1}
				{1,5}, {7,3}, {3, 5}
			};

		System.out.println(maximumwealth(accounts));
		
	}
	
	static int maximumwealth(int[][] accounts)
	{
		int max = accounts[0][0];
		
		for( int people=0 ; people < accounts.length; people++)
		{
			int sum =0;
			for(int account=0; account < accounts[people].length; account++)
			{
				sum = sum + accounts[people][account];
				
			}
				if(sum > max)
				{
					max = sum;
				}
			}
		
		return max;
	}

}
