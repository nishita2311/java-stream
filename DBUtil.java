package com.accenture.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author LKM
 * Utility class to create Database connection
 */
public class DBUtil {

	private final static String URL = "jdbc:mysql://localhost:3306/jdbcschema";
	private final static String USER = "root";
	private final static String PASSWORD = "root";
	private static Connection connection = null;

	public static Connection getDbConnection() {
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closeDbConnection() {
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
