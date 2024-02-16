package com.jspiders.designpattern.creational.factorymain;

import java.util.Scanner;

import com.jspiders.designpattern.creational.factory.Beverage;
import com.jspiders.designpattern.creational.factory.GingerTea;
import com.jspiders.designpattern.creational.factory.GreenTea;
import com.jspiders.designpattern.creational.factory.LemonTea;
import com.jspiders.designpattern.creational.factory.MasalaTea;

public class FactoryMain {
	public static void main(String[] args) {
		try {
			factory().order();
		} catch (NullPointerException e) {
			System.out.println("No tea is ordered..");
			e.printStackTrace();
		}
	}
	public static Beverage factory() {
		Beverage beverage = null;
		System.out.println("---- Order ----\n1. Masala Tea\n2. Lemon Tea\n3. Green Tea\n4. Ginger Tea");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give your order:");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1: beverage = new MasalaTea();
			break;
		case 2: beverage = new LemonTea();
			break;
		case 3:  beverage = new GreenTea();

			break;
		case 4: beverage = new GingerTea();
			break;
		default:  System.out.println("Invalid Drink!!");
		}
		scanner.close();
		return beverage;
	}
}
