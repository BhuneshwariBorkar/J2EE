// Create thread: by extend thread class
package com.jspiders.multithreading.main;

import com.jspiders.multithreading.thread.MyThread01;

public class ThreadMain01 {
	public static void main(String[] args) {
		MyThread01 myThread01 = new MyThread01();
		myThread01.start();
	}
}
