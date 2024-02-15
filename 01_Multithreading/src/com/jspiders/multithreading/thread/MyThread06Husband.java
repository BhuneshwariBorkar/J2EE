//Thread Created Without Synchronized 
package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource._01Account;

public class MyThread06Husband extends Thread{
	private _01Account _01account;
	
	public MyThread06Husband (_01Account _01account) {
		this._01account= _01account;
	}
	
	@Override
	public void run() {
		_01account.deposit(7000);
		_01account.withdraw(3000);
	}
}
