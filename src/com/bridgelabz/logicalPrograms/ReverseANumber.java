package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner scn = new Scanner(System.in);
		int  num = scn.nextInt();
		int  revnum = 0;
		int i = 0;
		scn.close();
		
		System.out.println("The Given number = "+num);
		
		while(num != 0)
		{
			i++;
			revnum = (revnum *10) + (num % 10);
			num = (int) (num / 10); 
		}
		System.out.println("Reverse of number = "+revnum);
		}

	}


