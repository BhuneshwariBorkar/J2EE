package com.jspiders.designpattern.creational.singletonmain;

import com.jspiders.designpattern.creational.singleton._01SingletonLazy;

public class _01SingletonLazyMain {
	public static void main(String[] args) {
		_01SingletonLazy _01singletonLazy1 = _01SingletonLazy.getObject();
		System.out.println(_01singletonLazy1);
		
		_01SingletonLazy _01singletonLazy2 = _01SingletonLazy.getObject();
		System.out.println(_01singletonLazy2);
	}
}
