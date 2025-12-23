package Week1.Day2;

public class IsPrime 
{

	public static void main(String[] args) 
	{
		
		int number=43;
		boolean isPrime=false;
		
		for (int i = 2; i <= number-1; i++) 
		{
			if(number%i == 0)
			{
				isPrime=true;
				break;
			}
		}
		
		if (isPrime==true)
		{
			System.out.println(number+ " is not a prime number");
		}
		else
		{
			System.out.println(number+ " is a prime number");
		}	
	}
}
