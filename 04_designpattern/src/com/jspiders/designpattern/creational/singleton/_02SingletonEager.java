package com.jspiders.designpattern.creational.singleton;

public class _02SingletonEager {
	private static _02SingletonEager _02singletonEager = new _02SingletonEager();
	
	private _02SingletonEager() {
		System.out.println("constructor is invoked..");
	}

	public static _02SingletonEager get_02singletonEager() {
		return _02singletonEager;
	}

	
}
