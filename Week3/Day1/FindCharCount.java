package Week3.Day1;

public class FindCharCount 
{

	public static void main(String[] args) 
	{
		//string instantiation
		String givenchar="TestLeaf";
		
		//initialize the local variable
		int count = 0;
		
		//convert the stringarray to char[]
		char[] chararray=givenchar.toCharArray();
		
		//counting the character E in given string
		for (int i = 0; i < chararray.length-1; i++) 
		{
			if(chararray[i]=='e')
			{
				count=count+1;					
			}
		}
		
		//print the count
		if(count>0)
		{
			System.out.println("Given string is '"+givenchar+"'");
			System.out.println("Total number of 'e' are "+count);
		}		
	}
}
