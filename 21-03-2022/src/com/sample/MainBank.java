package com.sample;
class Bank{
	static int amount=10000;
	synchronized void deposit(int damt) {
		System.out.println("Deposit method");
		amount=amount+damt;
		System.out.println("Amount after deposit "+amount);
		System.out.println("Deposit is completed");
		notify();
	}

	synchronized void withdraw(int wamt) throws InterruptedException {
		System.out.println("Withdraw method");
		if(wamt>amount) {
			wait();
		}

		amount=amount-wamt;
		System.out.println("Balance Amount  "+amount);

	}
}

public class MainBank {

	public static void main(String[] args) {
		Bank ob=new Bank();

		new Thread() {
			public void run() {
				try {
					ob.withdraw(20000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

		}.start();
		new Thread() {
			public void run() {
				ob.deposit(20000);
			}

		}.start();
	}

}


