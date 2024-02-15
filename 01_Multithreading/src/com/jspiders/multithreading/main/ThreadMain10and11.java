//Dead Lock:---
package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource._03Resource;
import com.jspiders.multithreading.thread.MyThread10;
import com.jspiders.multithreading.thread.MyThread11;

public class ThreadMain10and11 {
	public static void main(String[] args) {
		_03Resource _03resource = new _03Resource();
		MyThread10 myThread10 = new MyThread10(_03resource);
		MyThread11 myThread11 = new MyThread11(_03resource);
		
		myThread10.start();
		myThread11.start();
	}
}
