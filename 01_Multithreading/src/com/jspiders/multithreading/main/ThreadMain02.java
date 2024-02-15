// Create thread: by implementing  runnable interface
package com.jspiders.multithreading.main;

import com.jspiders.multithreading.thread.MyThread02;

public class ThreadMain02 {
	public static void main(String[] args) {
		MyThread02 myThread02 = new MyThread02();
		Thread thread = new Thread(myThread02);
		thread.start();
	}
}
