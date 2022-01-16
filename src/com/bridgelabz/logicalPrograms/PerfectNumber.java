package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) 
	{
		System.out.println("Enter a Number to find if its a Perfect Number or not");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int factsum = 0;
		scn.close();
		
		System.out.println("The Factors of number "+ num + " are");
		for(int i = 1; i < num; i++)
		{
			if(num % i == 0)
			{
				System.out.println(i);
				factsum = factsum + i;
			}
		}
		
		System.out.println("Factors sum = "+factsum);
		
		if(factsum == num)
			System.out.println("The given number "+ num + " is a Perfect Number");
		else
			System.out.println("The given number "+ num + " is not a Perfect Number");
		
	}

}
