// Create thread: by extend thread class
package com.jspiders.multithreading.thread;

public class MyThread01 extends Thread {
	@Override
	public void run() {
		System.out.println("Hello MyThread01");
	}
}
