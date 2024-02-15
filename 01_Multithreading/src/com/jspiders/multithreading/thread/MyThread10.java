//Dead Lock:---
package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource._03Resource;

public class MyThread10 extends Thread{
	private _03Resource _03resource;
	
	public MyThread10(_03Resource _03resource) {
		this._03resource = _03resource;
	}
	
	@Override
	public void run() {
		synchronized(_03resource.resource1) {
			System.out.println("Lock is applied on resource1 by MyThread10");
		}
		synchronized(_03resource.resource2) {
			System.out.println("Lock is applied on resource2 by MyThread10");
		}
	}	
}
