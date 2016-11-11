package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	public static Connection getConnection() {
		Connection connection = null;
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver ",
				url = "jdbc:sqlserver://localhost:1433/databaseName=thanghoang", user = "sa", pass = "thanghoang";
		try {
			Class.forName(driver);
			connection =  DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			// Orther err
			e.printStackTrace();
		}
		return connection;
	}

	public static void main(String[] args) {
		Connection connection = DatabaseConnection.getConnection();
		if (connection != null) {
			System.out.println("Kết nối thành công");
		} else {
			System.out.println("Kết nối thất bại");
		}
	}
}
