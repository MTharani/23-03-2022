package com.sample;

public class SampleThread extends Thread
{
	public void run()
	{
		
	}

	public static void main(String[] args)
	{ 
		SampleThread ob=new SampleThread();
		System.out.println(ob.isAlive());
		

	}

}
