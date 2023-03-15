package allStringProblems;

public class ReverseWord {

	// wriet a program to reverse a word from a string 
	
	public static void main(String[] args) {
		
		String input ="java code ";
		
		System.out.println(input);
		
		String output=" ";
		
		String[] words = input.split(" ");
		
		for(String word : words)
		{
			String revWord= " ";
			
			for(int i=word.length()-1 ; i>=0; i--)
			{
				revWord = revWord+word.charAt(i);
			}
			
			output = output+ revWord+ " ";
		}
		
		System.out.println(output);
		 
		
	}

}
