package com.java.jdbc.jdbcapp.dal;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import com.java.jdbc.jdbcapp.entities.Employee;

public class EmployeeRepository implements RepositoryAbstraction<Employee> {

	private static String DRIVER_CLASS;
	private static String CONNECTION_STRING;
	private static String USERNAME;
	private static String PASSWORD;

	public EmployeeRepository() throws IOException, Exception {
		try {
			readConfigurations();
		} catch (IOException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		}
	}

	public Integer add(Employee data) throws Exception {
		Connection connection = null;
		PreparedStatement statement = null;
		int result = 0;
		String insertQuery = "insert into employees(employee_id,employee_name) values(?,?)";
		try {
			Class.forName(DRIVER_CLASS);
			connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
			statement = connection.prepareStatement(insertQuery);
			statement.setInt(1, data.getEmployeeId());
			statement.setString(2, data.getEmployeeName());
			result = statement.executeUpdate();
			return result;

		} catch (ClassNotFoundException e) {
			throw e;
		} catch (SQLException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				throw e;
			}
		}
	}

	public Integer update(int id, Employee data) throws Exception {
		Connection connection = null;
		PreparedStatement statement = null;
		int result = 0;
		String updateQuery = "update employees set employee_name=? where employee_id=?";
		try {
			Class.forName(DRIVER_CLASS);
			connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
			statement = connection.prepareStatement(updateQuery);
			statement.setInt(2, id);
			statement.setString(1, data.getEmployeeName());
			result = statement.executeUpdate();
			return result;
		} catch (ClassNotFoundException e) {
			throw e;
		} catch (SQLException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				throw e;
			}
		}
	}

	public Integer remove(int id) throws Exception {
		Connection connection = null;
		PreparedStatement statement = null;
		int result = 0;
		String deleteQuery = "delete from employees where employee_id=?";
		try {
			Class.forName(DRIVER_CLASS);
			connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
			statement = connection.prepareStatement(deleteQuery);
			statement.setInt(1, id);
			result = statement.executeUpdate();
			return result;

		} catch (ClassNotFoundException e) {
			throw e;
		} catch (SQLException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				throw e;
			}
		}
	}

	public Set<Employee> getAllRecords() throws Exception {
		Connection connection = null;
		Statement statement = null;
		ResultSet records = null;
		Set<Employee> employees = null;
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
			employees = new HashSet<Employee>();
			while (records.next()) {
				Employee employee = new Employee();
				employee.setEmployeeName(records.getString(1));
				employee.setEmployeeId(records.getInt(2));
				employees.add(employee);
			}
			return employees;

		} catch (ClassNotFoundException e) {
			throw e;
		} catch (SQLException e) {
			throw e;
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				throw e;
			}
		}
	}

	public Employee getRecordById(int id) throws Exception {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet records = null;
		Employee employee = null;
		final String query = "select employee_id, employee_name from employees where employee_id=?";
		// update employees set employee_name=?, employee_salary=? where employee_id=?
		try {
			Class.forName(DRIVER_CLASS);
			connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			records = statement.executeQuery();
			while (records.next()) {
				employee = new Employee();
				employee.setEmployeeName(records.getString(1));
				employee.setEmployeeId(records.getInt(2));
			}
			return employee;
		} catch (ClassNotFoundException e) {
			throw e;
		} catch (SQLException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw e;
			}
		}

	}

	private static void readConfigurations() throws IOException {
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

		} catch (IOException e) {
			throw e;
		}
	}
}
