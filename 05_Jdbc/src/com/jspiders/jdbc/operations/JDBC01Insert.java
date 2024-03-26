package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC01Insert {
	public static void main(String[] args) throws SQLException {
//		load and register the driver
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
//		open connection between java application and database application
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:4406/weja4?user=root && password=root");
		
//		create the statement
		Statement statement = connection.createStatement();
		
//		execute the statement
		statement.execute("INSERT INTO user VALUES(1, 'Ram','ram@gmail.com','rem@123')");
		
//		process the result
		System.out.println("data inserted..");
		
//		close connection between java application and database application
		statement.close();
		connection.close();
		
//		de-register the driver
		DriverManager.deregisterDriver(driver);
	}
}
