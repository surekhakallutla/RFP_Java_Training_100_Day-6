package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class DecimaltoBinaryusingtoBinaryFunction {

	static int num;
	static String binarynum,newbinarynum;
	static int length;
	static String nibble1,nibble2;
	static int NewBinarynum;
	
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
			
		System.out.println("Enter the Decimal Number");
		num = scn.nextInt();
		scn.close();
		String a = "0";
		Binarynum();
		while(length != 8)
		{
			binarynum = a + binarynum;
			length++;
		}
		
		System.out.println(binarynum);
		
		newbinarynum = swapnibbles() ;
		System.out.println("New Binary number is "+newbinarynum);
		
		int Decimalnum = BinarytoDecimal();
		System.out.println("The Decimal number after swapping the nibbles is "+Decimalnum);
	}	
		
	public static void Binarynum()
	{
		binarynum = Integer.toBinaryString(num);
		System.out.println("The Binary representation of "+num+" is "+binarynum);
		length = binarynum.length();
		System.out.println(length);
	}
		
	public static String swapnibbles() 
	{	
		 nibble1 = binarynum.substring(0,4);
		System.out.println("nibble 1: "+nibble1);
		 nibble2 = binarynum.substring(4,8);
		System.out.println("nibble 2: "+nibble2);
		
		String temp = nibble1;
		nibble1 = nibble2;
		nibble2 = temp;
		
		String newbinarynum = nibble1 + nibble2;
		
		return(newbinarynum);
		
	}
		
	public static int BinarytoDecimal()
	{
		int decimalnum = 0;
		NewBinarynum =Integer.parseInt(newbinarynum);
		for(int n = 0; n <= length; n++)
		{
			if(NewBinarynum != 0)
			{
				int tempdec = NewBinarynum % 10;
				decimalnum = decimalnum + tempdec * (int) Math.pow(2,n);
				NewBinarynum = NewBinarynum / 10;
			}
			else
			{
				break;
			}
		}
		
		return(decimalnum);
	}
}		
		
		
	

