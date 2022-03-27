package com.sample;

public class MainApp1 {

	public static void main(String[] args) 
	{
		//Annonymous class
		new Thread()
		{
			public void run()
			{
				System.out.println("Run Method");
			}
				}.start();
				//using runnable interface
			Runnable rob= new Runnable() {
					public void runI()
					{
						System.out.println("runnable run method");
					}
						};
						Thread tob1=new Thread(rob);
						tob1.start();

		}

	}


