package Week3.Day1;

public class StringReverse {

	public static void main(String[] args) 
	{
		//String instantation
		String name="TestLeaf";
		
		//Convert the given string to char array
		char[] tochar=name.toCharArray();
		
		System.out.println("Given string is "+name);
		System.out.print("Reversed string is ");
		
		//Print the string in reversed order
		for (int i = tochar.length-1; i>=0 ; i--) 
		{
			System.out.print(tochar[i]);
		}
	}
	

}
