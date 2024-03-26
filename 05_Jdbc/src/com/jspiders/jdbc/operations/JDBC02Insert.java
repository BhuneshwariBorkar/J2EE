package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC02Insert {
	private static Connection connection ;
	private static Statement statement;
	private static String query;
	public static void main(String[] args) {
		
		try {
			openConnection();
			statement = connection.createStatement();
			query = "Insert into user values(2,'Bhumi','bhumi@gmail.com','bhumi@123')";
			int res = statement.executeUpdate(query);
			if(res == 1) {
				System.out.println(res+" row(s) affected");
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
	public static void openConnection() throws SQLException {
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection("jdbc:mysql://localhost:4406/weja4","root","root");
	}
	private static void closeConnection() throws SQLException {
		if(statement != null) {
			statement.close();
		}
		if(connection != null) {
			connection.close();
		}
		DriverManager.deregisterDriver(null);
	}

}
