package Week1.Day2;

public class FibonacciSeries
{

	public static void main(String[] args) 
	{
		int n=8;
		int a=0,b=1,c;
		
		System.out.print("Fibonacci series of "+n+" :");
		
		for (int i = 1; i <=n; i++) 
		{
			System.out.print(" "+a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
