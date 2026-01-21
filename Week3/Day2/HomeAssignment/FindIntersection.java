package Week3.Day2.HomeAssignment;

import java.util.Arrays;

public class FindIntersection 
{

	public static void main(String[] args) 
	{
		int a[]={3,2,11,4,6,7};
		int b[]={1,2,8,4,9,7};
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println("A array");
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nB array");
		for (int j = 0; j < b.length; j++) 
		{
			System.out.print(b[j]+" ");
		}
		
		System.out.println("\nAFter intersection");
		for (int x = 0; x < a.length; x++) 
		{
			for (int y = 0; y < b.length; y++) 
			{
				if(a[x]==b[y])
				{
					System.out.print(a[x]+" ");
				}
			}
		}
	}

}
