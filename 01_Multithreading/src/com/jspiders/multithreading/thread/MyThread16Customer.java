package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource._05Food;

public class MyThread16Customer extends Thread{
	private _05Food _05food;
	
	public MyThread16Customer(_05Food _05food) {
		this._05food = _05food;
	}
	
	@Override
	public void run() {
		_05food.order();
	}
}
