package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Principal Loan");
		int P = scn.nextInt();
		System.out.println("Enter No. Years to Pay-off");
		int Y = scn.nextInt();
		System.out.println("Enter Rate percent Interest");
		int R = scn.nextInt();
		scn.close();
		
		int n = 12 * Y;
		double r = R / (12 * 100);
		double payment = P * r /(1 - Math.pow(1 + r,-n));
		
		System.out.println("The Monthly Payments is "+ payment);
		
		System.out.println("Math.pow(1 + r,-n)= "+ Math.pow(1 + r,-n));
	}

}
