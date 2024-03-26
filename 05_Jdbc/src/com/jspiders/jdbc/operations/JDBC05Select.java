package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC05Select {
	private static Connection connection;
	private static Statement statement;
	private static String query;
	private static ResultSet resultSet;
	public static void main(String[] args) {
		try {
			openConnection();
			statement = connection.createStatement();
			query = "SELECT * FROM User";
			statement.execute(query);
			resultSet = statement.getResultSet();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));
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
		if(statement != null) {
			statement.close();
		} 
		if(connection != null) {
			connection.close();
		}
		
	}
}
