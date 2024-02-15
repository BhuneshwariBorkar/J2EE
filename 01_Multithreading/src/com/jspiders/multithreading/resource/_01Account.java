//Thread Created Without Synchronized 
package com.jspiders.multithreading.resource;

public class _01Account {
	private double AccountBalance;
	
	public void deposit(double ammount) {
		System.out.println("Ammount "+ammount+" credited!!");
		AccountBalance += ammount;
		System.out.println("current account balance: "+AccountBalance);
	}
	public void withdraw(double ammount) {
		System.out.println("Ammount "+ammount+" debited!!");
		AccountBalance -= ammount;
		System.out.println("current account balance: "+AccountBalance);
	}
}
