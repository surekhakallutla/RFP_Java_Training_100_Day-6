package com.bridgelabz.logicalPrograms;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {

	static int couponnum;
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the no. of distinct Coupon Numbers");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i;
		scn.close();
		int [] newcouponnum = new int [n];
		
		for( i = 0; i < n; i++)
		{
			newcouponnum[i] = RandomNumbers();
								
			System.out.println(newcouponnum[i]);
					
		}
		for(int j = 0; j <= newcouponnum.length; j++)
		{
			for(int k = j+1; k < newcouponnum.length; k++)
			{
				if(newcouponnum[j] == newcouponnum[k])
				{
					newcouponnum[k] = RandomNumbers();
					System.out.println("newcouponnum" + newcouponnum[k]);
				}
			}
		}
		System.out.println("Total Random numbers needed to print "+ n +" distinct coupon numbers is "+ i);
	}
	
	public static int RandomNumbers()
	{
		Random rad = new Random();
		couponnum =rad.nextInt(99999-10000+1)+10000;
		
		return(couponnum);
	}

}
