//Executing more than one thread simultaneously
package com.jspiders.multithreading.thread;

public class MyThread03 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello MyThread3");
		}
	}
}
