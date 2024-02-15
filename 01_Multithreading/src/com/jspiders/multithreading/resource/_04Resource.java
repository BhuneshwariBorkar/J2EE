// Method: Static Method Present in Thread class -- currentThread()
// getting object of currently executing thread
package com.jspiders.multithreading.resource;

public class _04Resource {
	public void resource() {
		System.out.println("Lock is applied on resource by "+Thread.currentThread().getName());
	}
}
