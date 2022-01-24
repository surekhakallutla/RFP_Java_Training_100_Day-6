package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class SimulateStopWatch {
	
	public long startTimer=0;
	public long stopTimer=0;
	public long elapsedTime;

	public void start()
	{
		startTimer = System.currentTimeMillis();
		System.out.println("Start Time is: "+startTimer);
	}
	
	public void stop()
	{
		stopTimer = System.currentTimeMillis();
		System.out.println("Stop Time is: "+stopTimer);
	}
	
	public long getElapsedTime()
	{
		elapsedTime = stopTimer-startTimer;
		return elapsedTime;
	}
	
	public static void main(String[] args) throws Exception
	{
		SimulateStopWatch sw = new SimulateStopWatch();
		System.out.println("Press '1' to Start Time: ");
		Scanner scn = new Scanner(System.in);
		scn.nextInt();
		sw.start();

		System.out.println();
		System.out.println("Press '2' to Stop Time: ");
		Scanner sc1 = new Scanner(System.in);
		scn.nextInt();
		sw.stop();

		long l=sw.getElapsedTime();
		System.out.println("Total Time Elapsed(in millisec) is:"+l);
		System.out.println();
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
		sc1.close();
		sc1.close();
	}
}