package Week3.Day1;

public class ReverseOddWords 
{
	public static void main(String[] args) 
	{
		//string declaration
		String str="I am a software tester";
		
		System.out.println("Given string is \n"+str);
		char[] oddwords;
		
		//output - "I ma a erawtfos tester”
		//splitting the given string into words
		String[] result=str.split(" ");
		
		//Find odd words and reversed them
		System.out.println("\noutput : ");
		for (int i = 0; i <= result.length-1; i++) 
		{
			if(i%2!=0)
			{
				oddwords=result[i].toCharArray();
				for (int j = oddwords.length-1; j>=0; j--)
				{
					System.out.print(oddwords[j]);
				}
			}
			else
			{
				System.out.print(" "+result[i]+" ");
			}
		}
	}

}
