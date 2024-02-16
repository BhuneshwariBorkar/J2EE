package com.jspiders.designpattern.creational.singleton;

public class _01SingletonLazy {
	private static _01SingletonLazy _01singletonLazy;
	
	private _01SingletonLazy() {
		System.out.println("Constructor is invoked!!");
	}
	public static _01SingletonLazy getObject() {
		if(_01singletonLazy == null) {
			_01singletonLazy = new _01SingletonLazy();
		}
		return _01singletonLazy;
	}
}
