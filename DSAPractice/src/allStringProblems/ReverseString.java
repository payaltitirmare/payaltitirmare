package allStringProblems;

public class ReverseString {

	//write a java program to reverse a string 
	
	public static void main(String payal[])
	{
		//input : hello
		//output : olleh 
		
		//1st approach 
		String s = "hello";
		
		System.out.println(s.length());
		for(int i=s.length()-1 ; i>=0 ; i--)
		{
			System.out.print(s.charAt(i)+ " ");
		}
		System.out.println("");
		
		//2nd approach 
		
		char[] chArr = s.toCharArray();
		
		for(int i=chArr.length-1; i>=0 ; i--)
		{
			System.out.print(chArr[i]+" ");
		}
		
		
	}
	
    }
