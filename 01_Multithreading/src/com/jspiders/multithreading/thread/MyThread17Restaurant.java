package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource._05Food;

public class MyThread17Restaurant extends Thread {
	private _05Food _05food;
	
	public MyThread17Restaurant(_05Food _05food) {
		this._05food = _05food;
	}
	
	@Override
	public void run() {
		_05food.prepare();
	}
}
