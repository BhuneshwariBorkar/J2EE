//Method: static method present inside Thread class --- sleep()
// it is use to pause the execution for certain time
package com.jspiders.multithreading.thread;

public class MyThread15 extends Thread{
	
	@Override
	public void run() {
		String msg = "Hello My Name Is Bhumi \n I Am Java Developer";
		char [] charArray = msg.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
