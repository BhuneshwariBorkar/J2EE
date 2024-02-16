package com.jspiders.designpattern.creational.singletonmain;

import com.jspiders.designpattern.creational.singleton._02SingletonEager;

public class _02SingletonEagerMain {
	public static void main(String[] args) {
		_02SingletonEager _02singletonEager1 = _02SingletonEager.get_02singletonEager();
		System.out.println(_02singletonEager1);
		
		_02SingletonEager _02singletonEager2 = _02SingletonEager.get_02singletonEager();
		System.out.println(_02singletonEager2);
	}
}
