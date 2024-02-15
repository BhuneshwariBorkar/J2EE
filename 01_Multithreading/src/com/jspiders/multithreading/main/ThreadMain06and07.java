//Thread Created Without Synchronized 
package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource._01Account;
import com.jspiders.multithreading.thread.MyThread06Husband;
import com.jspiders.multithreading.thread.MyThread07Wife;

public class ThreadMain06and07 {
	public static void main(String[] args) {
		_01Account _01account = new _01Account();
		MyThread06Husband myThread06Husband = new MyThread06Husband(_01account);
		MyThread07Wife myThread07Wife = new MyThread07Wife(_01account);
		
		myThread06Husband.start();
		myThread07Wife.start();
		
	}
}
