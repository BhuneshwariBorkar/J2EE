package com.jspiders.designpattern.creational.factory;

public class GreenTea implements Beverage{
	@Override
	public void order() {
		System.out.println("Green Tea is ordered..");
	}
}
