package JavaChallenge;

public class SquareRoot 
{

	public static void main(String[] args) 
	{
		int x=49;
		System.out.println("The given number is : "+x);
		
		int temp, squareroot;
		squareroot = x / 2;
		
		do 
		{
			temp = squareroot;
			squareroot = (temp + (x / temp))/2;
			//System.out.println(squareroot);
		} while((temp - squareroot) != 0);
		
		System.out.println("Square root of given number is : "+squareroot);
	}

}
