import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ResultSet records = null;
		try {
			// 1. register the driver for a database (loading the .class file from the
			// ojdbc8/11.jar file)
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. create connection to get connected to the database using the driver
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "Oracle2023");

			// 3. create the statement
			statement = connection.createStatement();

			// 4. execute a query
			records = statement.executeQuery("select employee_name, employee_id from employees");

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
}
