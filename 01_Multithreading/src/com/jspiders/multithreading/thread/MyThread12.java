// Method: Static Method Present in Thread class -- currentThread()
// getting object of currently executing thread
package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource._04Resource;

public class MyThread12 extends Thread{
	private _04Resource _04resource;
	
	public MyThread12(_04Resource _04resource) {
		this._04resource = _04resource; 
	}
	
	@Override
	public void run() {
		_04resource.resource();
	}
}
