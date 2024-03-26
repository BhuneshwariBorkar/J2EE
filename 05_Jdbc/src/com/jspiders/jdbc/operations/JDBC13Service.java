package com.jspiders.jdbc.operations;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class JDBC13Service {

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static String query;
	
	public static void signup(Scanner scanner) {
		System.out.println("Enter User Id");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter User Name");
		String name = scanner.nextLine();
		System.out.println("Enter User Email");
		String email = scanner.nextLine();
		System.out.println("Enter User Password");
		String password = scanner.nextLine();
		
		try {
			openConnection();
			query = "INSERT INTO user VALUES(?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, password);
			int res =preparedStatement.executeUpdate();
			if(res==1) {
				System.out.println("Sign Up Successfully");
			} else {
				System.out.println("Error");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void login(Scanner scanner) {
		scanner.nextLine();
		System.out.println("Enter User Email");
		String email = scanner.nextLine();
		System.out.println("Enter User Password");
		String password = scanner.nextLine();
		
		try {
			openConnection();
			query = "SELECT * FROM user WHERE email = ? AND password = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			resultSet =preparedStatement.executeQuery();
			if(resultSet.next()) {
				System.out.println("Log in Successfully");
				System.out.println("Welocome in Application");
			} else {
				System.out.println("Invalid login and password");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	private static void openConnection() throws SQLException {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:4406/weja4","root","root");
	}
	private static void closeConnection() throws SQLException {
		if(preparedStatement != null) {
			preparedStatement.close();
		}
		if(connection != null) {
			connection.close();
		}
	}
}
