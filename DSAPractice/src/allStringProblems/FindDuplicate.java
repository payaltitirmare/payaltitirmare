package allStringProblems;

public class FindDuplicate {

	public static void main(String[] args) {
		
		// remove duplicate from string 
		
		String str = "payaltiti";
		
		char[] arr = str.toCharArray();
		
		//paylti
		
		//StringBuffer sb = new StringBuffer();
		
		for (int i=0; i<arr.length; i++)
		{ 
			boolean repeated = false;
			for(int j=i+1; j<arr.length ; j++)
			{
				if(arr[i]==arr[j])
				{
					repeated = true;
					break;
				}
			}
			
			if(!repeated)
			{
				//sb.append(arr[i]);
				System.out.print(arr[i]);
			}
		}

		//System.out.println(sb);
		
		// find duplicate character 
		System.out.println(" ");
		System.out.println( " "+ "duplicate characters are :");
		
		for (int i=0; i<arr.length; i++)
		{ 
			for(int j=i+1; j<arr.length ; j++)
			{
				
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
	}

}
