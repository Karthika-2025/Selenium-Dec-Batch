package JavaChallenge;

public class LastWordLength 
{

	public static void main(String[] args) 
	{
		//string instantiation
		String s="Hello World";
		System.out.println("Given String is : "+s);	
		
		//SPlit the sentence into words
		String splitarray[]=s.split(" ");
		System.out.println("Last word is : "+splitarray[(splitarray.length)-1]);
		
		//Assign last word to string and Split it into char array
		String newstr=splitarray[(splitarray.length)-1];
		char[] ch=newstr.toCharArray();
		
		//Print the last word chars count
		System.out.println("Last word char count is : "+ch.length);
	}
}
