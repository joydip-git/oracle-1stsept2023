package com.java.jdbc.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App {
	static final String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
	static final String CONNECTION_STRING = "jdbc:oracle:thin:@localhost:1521:orcl";
	static final String USERNAME = "system";
	static final String PASSWORD = "Oracle2023";

	public static void main(String[] args) {

	}

	static void fetchAllRecords() {
		Connection connection = null;
		Statement statement = null;
		ResultSet records = null;
		String getAllQeury = "select employee_name, employee_id from employees";
		try {
			// 1. register the driver for a database (loading the .class file from the
			// ojdbc8/11.jar file)
			Class.forName(DRIVER_CLASS);

			// 2. create connection to get connected to the database using the driver
			connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);

			// 3. create the statement
			statement = connection.createStatement();

			// 4. execute a query
			records = statement.executeQuery(getAllQeury);

			// 5. display the returned data
			while (records.next()) {

				String name = records.getString("employee_name");
				int id = records.getInt(2);
				System.out.println(name + ", " + id);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	static void fetchRecordById() {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet records = null;
		final String query = "select employee_id, employee_name from employees where employee_id=?";
		// update employees set employee_name=?, employee_salary=? where employee_id=?
		try {
			Class.forName(DRIVER_CLASS);
			connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
			statement = connection.prepareStatement(query);
			statement.setInt(1, 3);
			records = statement.executeQuery();
			while (records.next()) {
				System.out.println(records.getInt(1) + ", " + records.getString(2));
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
