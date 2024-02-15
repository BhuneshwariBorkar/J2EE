//Thread Created Synchronized 
package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource._02Account;

public class MyThread08HusbandSyn extends Thread{
	private _02Account _02account;
	
	public MyThread08HusbandSyn(_02Account _02account) {
		this._02account = _02account;
	}
	
	@Override
	public void run() {
		_02account.deposit(5000);
		_02account.withdraw(2000);
	}
}
