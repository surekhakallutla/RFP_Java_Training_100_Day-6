package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class SimulateStopWatch {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Start time of Stop Watch");
		double starttime = scn.nextDouble();
		System.out.println("Enter Stop time of Stop Watch");
		double stoptime = scn.nextDouble();
		scn.close();
		double elapsedtime = stoptime - starttime;
		
		System.out.println("The Elapsed time between Start time and End time is "+elapsedtime);
		

	}

}
