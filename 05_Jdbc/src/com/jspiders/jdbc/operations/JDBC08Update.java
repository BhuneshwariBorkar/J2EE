package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC08Update {
	private static Connection connection;
	private static Statement statement;
	private static String query;
	public static void main(String[] args) {
		try {
			openConnection();
			statement = connection.createStatement();
			query = "UPDATE user SET Password = 'ABHI@123' WHERE id =3";
			statement.execute(query);
			System.out.println("Password Updated..");
		} catch (SQLException e) {
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
		if(statement != null) {
			statement.close();
		}
		if(connection != null) {
			connection.close();
		}
	}
	
}
