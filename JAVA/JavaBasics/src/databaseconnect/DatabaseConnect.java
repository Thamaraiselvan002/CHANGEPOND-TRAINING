package databaseconnect;

import java.sql.*;
public class DatabaseConnect {
	public static void main(String[] args) throws Exception {
		String dburl="jdbc:mysql://localhost:3306/employees";
		String dbuseraname="root";
		String dbpassword="Database@123";
		String query="select * from departments";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(dburl, dbuseraname, dbpassword);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		String name=rs.getString("department_name");
		rs.next();
		System.out.println(name);
		st.close();
		rs.close();
	}
	
}
