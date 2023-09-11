package com.java.jdbc.jdbcapp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.Statement;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App {

	static String DRIVER_CLASS;
	static String CONNECTION_STRING;
	static String USERNAME;
	static String PASSWORD;

	static void readConfigurations() {
		FileReader reader = null;
		Properties dbProperties = null;
		try {
			reader = new FileReader("src/main/resource/database.properties");

			dbProperties = new Properties();
			dbProperties.load(reader);

			DRIVER_CLASS = dbProperties.getProperty("drivername");
			CONNECTION_STRING = dbProperties.getProperty("connectionstring");
			USERNAME = dbProperties.getProperty("username");
			PASSWORD = dbProperties.getProperty("password");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			readConfigurations();
			// fetchAllRecords();
			// fetchRecordById();
			//insertRecord();
			//updateRecord();
			deleteRecord();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void insertRecord() {
		Connection connection = null;
		PreparedStatement statement = null;
		int result = 0;
		String insertQuery = "insert into employees(employee_id,employee_name) values(?,?)";
		try {
			Class.forName(DRIVER_CLASS);
			connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
			statement = connection.prepareStatement(insertQuery);
			statement.setInt(1, 10);
			statement.setString(2, "Kuldeep");
			result = statement.executeUpdate();
			System.out.println(result > 0 ? "inserted" : "could not insert");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
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

	static void updateRecord() {
		Connection connection = null;
		PreparedStatement statement = null;
		int result = 0;
		String updateQuery = "update employees set employee_name=? where employee_id=?";
		try {
			Class.forName(DRIVER_CLASS);
			connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
			statement = connection.prepareStatement(updateQuery);
			statement.setInt(2, 10);
			statement.setString(1, "Kuldeep Soni");
			result = statement.executeUpdate();
			System.out.println(result > 0 ? "updated" : "could not update");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
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

	static void deleteRecord() {
		Connection connection = null;
		PreparedStatement statement = null;
		int result = 0;
		String deleteQuery = "delete from employees where employee_id=?";
		try {
			Class.forName(DRIVER_CLASS);
			connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
			statement = connection.prepareStatement(deleteQuery);
			statement.setInt(1, 10);
			result = statement.executeUpdate();
			System.out.println(result > 0 ? "deleted" : "could not delete");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
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
