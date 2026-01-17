package Week3.Day1;

import java.util.Arrays;

public class FindDuplicateNumbers 
{

	public static void main(String[] args) 
	{
		int num[]= {2, 5, 7, 7, 5, 9, 2, 3};
		// {2, 5, 7, 7, 5, 9, 2, 3}
		Arrays.sort(num);
		System.out.println("Sorted array");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(" "+num[i]);
		}
		System.out.println();
		System.out.println("Duplicates are : ");
		for (int i = 0; i < num.length-1; i++) 
		{
				if(num[i]==num[i+1])
				{
					System.out.println(num[i]);	
				}	
		}
	}
}
