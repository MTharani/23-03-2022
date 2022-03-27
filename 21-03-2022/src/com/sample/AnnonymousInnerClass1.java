package com.sample;

interface Myint
{
	void add();
	void sub();
}
public class AnnonymousInnerClass1 {

	public static void main(String[] args) 
	{
		Myint ob=new Myint()
				{

					@Override
					public void add() {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void sub() {
						// TODO Auto-generated method stub
						
					}
			
				};
				ob.add();
				ob.sub();



	}

	}
