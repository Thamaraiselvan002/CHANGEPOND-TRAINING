package org.studyeasy.Config;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class DatabaseConfig {
	public static Connection getConnection() {
		 Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javademo", "root", "Database@123");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("MySQL JDBC driver not found.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error connecting to the database.");
        } 
        return con;
    }
	

	
}
