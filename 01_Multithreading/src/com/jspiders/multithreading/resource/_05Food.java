package com.jspiders.multithreading.resource;

public class _05Food {
	public boolean available;
	
	public synchronized void order() {
		System.out.println("Order Deliver!!");
		if(available) {
			System.out.println("Food Order!!");
		}
		else {
			System.out.println("Food is not available");
			System.out.println("Wait for some time");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(available) {
				System.out.println("Food Order!!");
			}
		}
	    
	}
	
	public synchronized void prepare() {
		System.out.println("Food is getting Prepared");
		System.out.println("food is prepared!!");
		available = true;
		notify();
	}
}
