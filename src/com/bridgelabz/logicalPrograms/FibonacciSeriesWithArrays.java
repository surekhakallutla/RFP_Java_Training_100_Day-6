package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class FibonacciSeriesWithArrays {

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the n value to fibonacci Series");
		int n = scn.nextInt();
		
		int fibArray[] =  new int[n+2];
		System.out.println("Enter the first and Second numbers in Fibonacci Array");
		fibArray[0] = scn.nextInt();
		fibArray[1] = scn.nextInt();
		scn.close();
		
		System.out.print("{"+fibArray[0] + ", "+fibArray[1]+ ", ");
		for(int i = 2; i < n; i++)
		{
			fibArray[i] = fibArray[i-1] + fibArray[i-2];
			
			System.out.print( fibArray[i] + ", " );
		}
		System.out.print("}");
	}

}
