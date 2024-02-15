//Thread Created Synchronized 
package com.jspiders.multithreading.resource;

public class _02Account {
	private double AccountBalance;
	
	public synchronized void deposit(double amount) {
		System.out.println("amount "+amount+" creadited");
		AccountBalance += amount;
		System.out.println("current balance : "+AccountBalance);
	}
	public synchronized void withdraw(double amount) {
		System.out.println("amount "+amount+" debited");
		AccountBalance += amount;
		System.out.println("current balance : "+AccountBalance);
	}
}
