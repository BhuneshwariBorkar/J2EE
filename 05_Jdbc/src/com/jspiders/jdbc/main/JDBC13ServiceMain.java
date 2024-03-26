package com.jspiders.jdbc.main;
import java.util.Scanner;

import com.jspiders.jdbc.operations.JDBC13Service;

public class JDBC13ServiceMain {
	public static void main(String[] args) {
		boolean flag = true;
		while(flag) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter 1 to Sign Up\nEnter 2 to Login\nEnter 3 to Exit");
			System.out.println("Enter Choice:");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: JDBC13Service.signup(scanner);
				break;
			case 2: JDBC13Service.login(scanner);
				break;
			case 3: System.out.println("Thank You!!");
					flag=false;
				break;
			default:
				break;
			}
		}
	}
}
