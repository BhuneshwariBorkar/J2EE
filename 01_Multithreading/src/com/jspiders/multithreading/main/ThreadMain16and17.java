package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource._05Food;
import com.jspiders.multithreading.thread.MyThread16Customer;
import com.jspiders.multithreading.thread.MyThread17Restaurant;

public class ThreadMain16and17 {
	public static void main(String[] args) {
		_05Food _05food = new _05Food();
		
		MyThread16Customer myThread16Customer = new MyThread16Customer(_05food);
		myThread16Customer.start();
		MyThread17Restaurant myThread17Restaurant = new MyThread17Restaurant(_05food);
		myThread17Restaurant.start();
	}
}
