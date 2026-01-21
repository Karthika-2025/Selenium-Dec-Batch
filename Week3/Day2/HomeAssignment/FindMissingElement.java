package Week3.Day2.HomeAssignment;

import java.sql.Array;
import java.util.Arrays;

public class FindMissingElement 
{

	public static void main(String[] args) 
	{
		int[] arr= {1,4,3,2,8,6,10};
		
		System.out.println("Given array");

		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		
		Arrays.sort(arr);
		
		System.out.println("\nAfter sort");
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\nMissing elements");
		
		//ar: 1,2,3,4,6,8
		//i : 0,1,2,3,4,5
		for (int i = 0; i < arr.length-1; i++) 
		{
			
			if(arr[i+1]!=arr[i]+1)
			{
				System.out.println(arr[i]+1);
			}
		}
	}
}
