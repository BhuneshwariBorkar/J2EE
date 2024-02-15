// Thread Access: With The help of Thread Properties
package com.jspiders.multithreading.thread;

public class MyThread05 extends Thread{
	@Override
	public void run() {
		System.out.println("Hello MyThread05");
		System.out.println("id: "+getId());
		System.out.println("name: "+getName());
		System.out.println("priority: "+getPriority());
	}
}
