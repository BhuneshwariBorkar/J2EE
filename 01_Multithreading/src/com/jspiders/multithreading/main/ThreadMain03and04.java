//Executing more than one thread simultaneously
package com.jspiders.multithreading.main;

import com.jspiders.multithreading.thread.MyThread03;
import com.jspiders.multithreading.thread.MyThread04;

public class ThreadMain03and04 {
	public static void main(String[] args) {
		MyThread03 myThread03 = new MyThread03();
		MyThread04 myThread04 = new MyThread04();
		myThread03.start();
		myThread04.start();
	}
}
