package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter non Negative Number (c)");
		double c = scn.nextInt();
		Double t = c;		
		double e = 2.7183;
		double  epsilon = 1 * Math.pow(e, -15);
		
		scn.close();
		
		while(Math.abs(t - (c / t)) > epsilon * t)
		{
			t = ((c / t) + t) / 2;
		}
		
		System.out.println("The square root of non negative number "+ c + " is "+t);
	}

}
