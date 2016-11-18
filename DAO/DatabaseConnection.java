package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	final static String driver = /* "net.sourceforge.jtds.jdbc.Driver" */"com.microsoft.sqlserver.jdbc.SQLServerDriver",
			url = /* "jdbc:jtds:sqlserver://localhost:1433/thanghoang;" */"jdbc:sqlserver://localhost:1433;databaseName=thanghoang;instance=SQLSERVER;encrypt=true;TrustServerCertificate=true;",
			user = "sa", pass = "thanghoang";
	
	public static Connection getConnection() {
		Connection connection = null;		
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			// Orther err
			e.printStackTrace();
		}
		return connection;
	}

	public static void close() {
		if (getConnection() != null) {
			try {
				getConnection().close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
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
