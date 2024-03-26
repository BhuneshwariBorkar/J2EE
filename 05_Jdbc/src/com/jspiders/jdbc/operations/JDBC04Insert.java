package com.jspiders.jdbc.operations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;


public class JDBC04Insert {
	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static String query ;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			openConnection();
			query = "INSERT INTO user VALUES(?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		scanner.close();
		
	}
	private static void openConnection() throws SQLException, IOException {
		File file = new File("E:\\ADV_JAVA_Test\\J2EE\\05_Jdbc\\db_info.txt");
		FileReader fileReader = new FileReader(file);
		Properties properties = new Properties();
		properties.load(fileReader);
		
		connection = DriverManager.getConnection(properties.getProperty("url"),properties);
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
