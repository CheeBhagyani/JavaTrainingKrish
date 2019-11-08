package com.training.exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
	private static final String USER = "postgres";
	private static final String PWD = "1qaz2wsx";
	private static String driverClass = "org.postgresql.Driver";
	
	private static Connection conn = null;
	private static ConnectionFactory connectionFactory = null;
	
	private ConnectionFactory() {
		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(URL, USER, PWD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Opened database successfully");
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if(null != connectionFactory) {
			return conn;
		}
		else {
			connectionFactory = new ConnectionFactory();
			return conn;
		}
	}

}
