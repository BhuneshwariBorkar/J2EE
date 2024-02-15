//Thread Created Without Synchronized 
package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource._01Account;

public class MyThread07Wife extends Thread{
	private _01Account _01account;
	
	public MyThread07Wife(_01Account _01account) {
		this._01account = _01account;
	}
	
	@Override
	public void run() {
		_01account.deposit(9000);
		_01account.withdraw(7000);
	}
}
