package com.bridgelabz.logicalPrograms;

public class pattern2hollowtriangle 
{

		public static void main(String[] args)
		{
			
			int i,j;
			int n = 7;
			
			for(i=1; i<=n; i++)
			{
				for(j=1 ; j<=i ; j++)
				{
					if(j==1 ||j==i || i==n )
						System.out.print("* ");
					else
						System.out.print("  ");
				
				}
				
			System.out.println(" ");
			}
	
	}
}