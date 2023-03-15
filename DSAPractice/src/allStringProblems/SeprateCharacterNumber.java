package allStringProblems;

public class SeprateCharacterNumber {

	public static void main(String[] args) {
		
		// seprate character , number , and special symbol 
		//input : - abc123@#$23xyz
		//output :- alpha= abcxyz     ,  numeric= 12323  ,      specialcharacter = @#$
		
		String str = "abc123@#$23xyz";
		
		String num= " ";
		String splchar= " ";
		String alpha= " ";
		
		char ch[] = str.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			if(Character.isDigit(ch[i]))
			{
				num = num+ ch[i];
			}
			else if(Character.isAlphabetic(ch[i]))
			{
				alpha = alpha + ch[i];
			}
			else
			{
				splchar = splchar+ ch[i];
			}
		}
		
		System.out.println(num);
		System.out.println(alpha);
		System.out.println(splchar);
	   }
    }
