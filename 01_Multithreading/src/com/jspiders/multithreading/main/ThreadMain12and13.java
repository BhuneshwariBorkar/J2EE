package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource._04Resource;
import com.jspiders.multithreading.thread.MyThread12;
import com.jspiders.multithreading.thread.MyThread13;

public class ThreadMain12and13 {
	public static void main(String[] args) {
		_04Resource _04resource = new _04Resource();
		
		MyThread12 myThread12 = new MyThread12(_04resource);
		MyThread13 myThread13 = new MyThread13(_04resource);
		
		myThread12.setName("myThread12");
		myThread12.start();
		
		myThread13.setName("myThread13");
		myThread13.start();
	}
}
