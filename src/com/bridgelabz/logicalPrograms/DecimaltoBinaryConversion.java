package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class DecimaltoBinaryConversion {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Decimal Number");
		int num = scn.nextInt();
		scn.close();
		
		int binary[] = new int[35];
		int i = 0 ;
		System.out.println("The Binary representation of "+num+" is ");
		while(num > 0)
		{
			binary[i] = num % 2;
			num = num / 2;
//			System.out.print(binary[i]);
			i++; 
		
		}
//		System.out.println();
		for(int j = i-1; j >= 0;j--)
		{
			System.out.print(binary[j]);
			if(j % 4 == 0)
				System.out.print(" ");
		}
		
		

	}

}
