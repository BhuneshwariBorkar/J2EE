package com.jspiders.designpattern.structural.adaptermain;

import com.jspiders.designpattern.structural.adapter.Adapter;

public class AdapterMain {
	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		adapter.setName("RAM");
		adapter.menday();
		
		adapter.setName("RANI");
		adapter.womenday();
	}
}
