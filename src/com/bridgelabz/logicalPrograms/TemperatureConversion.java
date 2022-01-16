package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) 
	{
		System.out.println("Enter Temperature value in Fahrenheit");
		
		Scanner scn = new Scanner(System.in);
		double fahrenheit = scn.nextDouble();
		
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("The "+fahrenheit + "F temperature in celsius is "+celsius);
		
		System.out.println("Enter Temperature value in Celsius");
		 celsius = scn.nextDouble();
		
		fahrenheit = (celsius * 9 / 5 ) + 32;
		System.out.println("The "+celsius + "C temperature in Fahrenheit is "+fahrenheit);
		
		scn.close();

	}

}
