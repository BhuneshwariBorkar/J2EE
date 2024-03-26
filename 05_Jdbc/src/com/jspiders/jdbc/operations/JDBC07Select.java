package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC07Select {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query;
	private static ResultSet resultSet;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter User id: ");
		int id = scanner.nextInt();
		scanner.close();
		try {
			openConnection();
			query = "SELECT * FROM user WHERE id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));
			} else {
				System.out.println("User is not found");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void openConnection() throws SQLException {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:4406/weja4","root","root");
		
	}
	public static void closeConnection() throws SQLException {
		if(preparedStatement != null) {
			preparedStatement.close();
		} 
		if(connection != null) {
			connection.close();
		}
		
	}
}
