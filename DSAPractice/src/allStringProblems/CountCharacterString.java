package allStringProblems;

public class CountCharacterString {

	public static void main(String[] args) {
		
		//write a program to count character except space 
		
		String str = " payal  java " ;
		
		System.out.println(str.length());
		
		int count=0;
		
			for(int i=0 ; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
