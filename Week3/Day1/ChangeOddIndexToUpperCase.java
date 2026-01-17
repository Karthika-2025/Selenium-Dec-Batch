package Week3.Day1;

public class ChangeOddIndexToUpperCase 
{
	public static void main(String[] args) 
	{
		
		//string instantiation
		String str="changeme";
		String res="";
		
		System.out.println("Given string is "+str);
		
		//convert string to chararray
		char[] chararr=str.toCharArray();
		
		//Finding odd char and convert them into uppercase
		for (int i = 0; i < chararr.length; i++) 
		{
			if(i%2!=0)
			{
				chararr[i]=Character.toUpperCase(chararr[i]);
			}
			
			res=res+chararr[i];
		}
		System.out.println("Odd indexuppercase is "+res);
	}
}
