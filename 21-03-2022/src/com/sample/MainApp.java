package com.sample;

public class MainApp {

	public static void main(String[] args) 
	{
		//Annonymous Class
		Thread tob=new Thread()
				{
			public void run()
			{
				System.out.println("Run Method");
			}
				};
				tob.start();

	}

}
