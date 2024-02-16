package com.jspiders.designpattern.creational.factory;

public class LemonTea implements Beverage{
	@Override
	public void order() {
		System.out.println("Lemon tea is ordered..");
	}
}
