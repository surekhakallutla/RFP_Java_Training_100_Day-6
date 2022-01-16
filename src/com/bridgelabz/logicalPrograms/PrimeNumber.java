package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number to check if it is a Prime Number or not");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int a = 1;
		scn.close();
		
		System.out.println("The prime factors are ");
		for(int i = 1; i <= num; i++)
		{
			if(num % i == 0)
			{
				System.out.println(i);
				a = a * i;
			}
			
		}
		
		if(a == 1 || a == 0)
			System.out.println("The given Number "+ num + " is not a Prime Number");
		else if(a == 2 || a == num)
			System.out.println("The given Number "+ num +" is a Prime Number");
		else 
			System.out.println("The given Number "+ num + " is not a Prime Number");
	}

}
