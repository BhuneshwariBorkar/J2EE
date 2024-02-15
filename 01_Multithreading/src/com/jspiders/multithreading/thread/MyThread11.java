//Dead Lock:---
package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource._03Resource;

public class MyThread11 extends Thread{
	private _03Resource _03resource;
	
	public MyThread11(_03Resource _03resource) {
		this._03resource = _03resource;
	}
	
	@Override
	public void run() {
		synchronized (_03resource.resource2) {
			System.out.println("Lock is applied on resource 1 by MyThread11");
		}
		synchronized (_03resource.resource1) {
			System.out.println("Lock is applied on resource 2 by MyThread11");
		}
	}
	
}
