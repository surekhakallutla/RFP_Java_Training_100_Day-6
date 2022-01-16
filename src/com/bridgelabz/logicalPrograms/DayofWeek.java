package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class DayofWeek {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Month: ");
		int m = scn.nextInt();
		if(m<=0 || m>12)
		{
			System.out.println("Invalid Input Enter month value again");
			m = scn.nextInt();
		}
		System.out.println("Enter Date: ");
		int d = scn.nextInt();
		
		System.out.println("Enter Year: ");
		int y = scn.nextInt();
		scn.close();
		
		int Y = y - ((14 - m) /12);
		int X = Y + (Y/4) - (Y/100) + (Y/400);
		int M = m + (12 * ((14 - m)/12)) - 2;
		int D = (d + X + ((31 * M) / 12)) % 7;
		
		switch (D)
		{
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}

	}

}
