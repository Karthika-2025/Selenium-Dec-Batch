package Week3.Day1;

public class StringPalindrome 
{
	public static void main(String[] args) 
	{
		//String instantation
		String str1="Karthika";
		String str2="";
		
		//Convert the given string to char array
		for (int i = str1.length()-1; i>=0; i--) 
		{
			str2=str2+str1.charAt(i);
		}
		
		System.out.println("Given string is "+str1);
		System.out.println("Reversed string is "+str2);
		
		//CHecking palindrome or not
		if(str1.equals(str2))
		{
			System.out.println("\nGiven string is palindrome");
		}
		else
		{
			System.out.println("\nGiven string is not palindrome");
		}
	}
}
