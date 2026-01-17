package Week3.Day1;

public class RemoveDuplicate 
{
	public static void main(String[] args) 
	{
		//string instantiation
		String str="We learn Java basics as part of java sessions in java week1";
		
		//output is - We learn Java basics as part of   sessions in   week1
		
		System.out.println("Given string is \n"+str);
		
		//Splitting the given string into words
		String[] removedup=str.split(" ");
		
		//checking duplicate strings
		for (int i = 0; i <= removedup.length-1; i++) 
		{
			for (int j = i+1; j <= removedup.length-1; j++) 
			{
				if(removedup[i].equalsIgnoreCase(removedup[j]))
				{
					removedup[j]=" ";
				}
			}
		}
		
		//Display the final string
		System.out.println("\nOutput is");
		for (int i = 0; i <=removedup.length-1; i++) 
		{
		System.out.print(removedup[i]+" ");
		}
	}
}
