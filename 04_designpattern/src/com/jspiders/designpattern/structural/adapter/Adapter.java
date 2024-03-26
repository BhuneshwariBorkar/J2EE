package com.jspiders.designpattern.structural.adapter;

public class Adapter extends Employee implements Event {

	@Override
	public void menday() {
		System.out.println("The chief guest for mens day is "+getName());
	}

	@Override
	public void womenday() {
		System.out.println("The chief guest for womens day is "+getName());
	}
	
}
