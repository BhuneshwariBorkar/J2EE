//Thread Created Synchronized 
package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource._02Account;
import com.jspiders.multithreading.thread.MyThread08HusbandSyn;
import com.jspiders.multithreading.thread.MyThread09WifeSyn;

public class ThreadMain08and09Syn {
	public static void main(String[] args) {
		_02Account _02account = new _02Account();
		MyThread08HusbandSyn myThread08HusbandSyn = new MyThread08HusbandSyn(_02account);
		MyThread09WifeSyn myThread09WifeSyn = new MyThread09WifeSyn(_02account);
		
		myThread08HusbandSyn.start();
		myThread09WifeSyn.start();
	}
}
