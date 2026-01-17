package Week3.Day1;

public class ReverseSentence 
{

	public static void main(String[] args) 
	{
		//String instantation
		String str="Amazon development centre Chennai";
		
		str.toLowerCase();
		System.out.println("Given string is \n" +str);
		
		//using split method
		String[] str1=str.split(" ");
		
		//display the reversed sentence
		System.out.println("Reversed sentence is ");
		for (int i = str1.length-1; i>=0 ; i--) 
		{
				System.out.print(str1[i]+" ");
		} 
	}
}
