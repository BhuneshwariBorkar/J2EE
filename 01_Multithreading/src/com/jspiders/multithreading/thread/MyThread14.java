// Method: non-Static Method Present in Thread class -- stop()
// move the thread from running to stop phase forcefully --- deprecated
package com.jspiders.multithreading.thread;

public class MyThread14 extends Thread{
	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("MyThread14");
			if(i==3) {
				stop();
			}
		}
	}
	
}
