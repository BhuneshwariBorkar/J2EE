package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource._02Account;

public class MyThread09WifeSyn extends Thread{
	private _02Account _02account;
	
	public MyThread09WifeSyn (_02Account _02account) {
		this._02account = _02account; 
	}
	
	@Override
	public void run() {
		_02account.deposit(6000);
		_02account.withdraw(3000);
	}
}
