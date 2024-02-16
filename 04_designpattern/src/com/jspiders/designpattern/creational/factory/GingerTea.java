package com.jspiders.designpattern.creational.factory;

public class GingerTea implements Beverage{
	@Override
	public void order() {
		System.out.println("Ginger tea is ordered..");
	}
}
