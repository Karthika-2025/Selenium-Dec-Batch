package JavaChallenge;

public class StringPalindromeCheck 
{

	public static void main(String[] args) 
	{
		//String declaration
		String s="Race * car";
		String ne="";
		String original="";
		
		System.out.println("Given string - \n"+s);
		
		//Convert the given string in lower case
		s=s.toLowerCase();		
		
		//Convert given string to char array
		char[] chararr=s.toCharArray();
		
		//Removing non-alphanumerics
		for (int i = 0; i < chararr.length; i++) 
		{
			if(Character.isLetterOrDigit(chararr[i]))
			{
				original=original+chararr[i];
			}				
		}		
		System.out.println("Given string without non alphanumeric -\n"+original);
				
		//Reversing the given string
		for (int i = chararr.length-1; i >=0; i--) 
		{
			if(Character.isLetterOrDigit(chararr[i])) 
			{
				ne=ne+chararr[i];
			}
		}
		System.out.println("Reversed string - \n"+ne);
		
		//Checking palindrome
		if(original.equals(ne))
		{
			System.out.println("True - Given string is palindrome");
		}
	}
}
