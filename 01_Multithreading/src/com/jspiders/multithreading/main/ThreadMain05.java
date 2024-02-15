// Thread Access: With The help of Thread Properties
package com.jspiders.multithreading.main;

import com.jspiders.multithreading.thread.MyThread05;

public class ThreadMain05 {
	public static void main(String[] args) {
		MyThread05 myThread05 = new MyThread05();
		myThread05.setName("Bhumi");
		myThread05.setPriority(7);
		myThread05.start();
	}
}
