package com.bridgelabz.logicalPrograms;

import java.util.*;

public class VendingMachine {
	static int i = 0;
	static int total = 0;
	static int [] notes = {1, 2, 5, 10, 50, 100, 500, 1000};
	static int money;
	
	public static void main(String[] args)
	{
		int choice = 0;
		Scanner scn = new Scanner(System.in);
		do 
		{
			System.out.println("Enter the Amount to Withdraw ");
			money = scn.nextInt();
			
			calculate(money,notes, 0);
			
			System.out.println("Total no. of Notes are " + total);
			System.out.println("Press 1 for continue");
			choice = scn.nextInt();
		}while(choice == 1);
		
		scn.close();

	}
	
	public static int calculate(int money , int[] notes, int i)
	{
		int rem;
		
		while(money > notes[i])
			{
				int calnotes = money / notes[i];
				rem = money % notes[i];
				money = rem;
				total = total + calnotes;
				System.out.println(notes[i] + " Notes = " + calnotes);	
			}
		i++;
		
		return calculate(money, notes, i);
	}

}
