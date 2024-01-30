package org.studyeasy.model;
import org.studyeasy.Config.DatabaseConfig;
import org.studyeasy.entity.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

public class UserModel {
    public List<User> listusers() {
        List<User> listusers = new ArrayList<>();
        Connection conn = DatabaseConfig.getConnection();

        if (conn != null) {
            System.out.println("Connection is not null");

            try (Statement st = conn.createStatement()) {
                String query = "select * from User";
                ResultSet rs = st.executeQuery(query);

                while (rs.next()) {
                    listusers.add(new User(rs.getInt("user_id"), rs.getString("username"), rs.getString("email")));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("Connection is null");
        }

        return listusers;
    }
    public void addUser(User newuser) {
        Connection connect = null;
        PreparedStatement statement = null;

        try {
            connect = DatabaseConfig.getConnection();
            String username = newuser.getUsername();
            String email = newuser.getEmail();
            String query = "INSERT INTO user (username, email) VALUES (?, ?)";

            if (connect != null) {
                statement = connect.prepareStatement(query);
                statement.setString(1, username);
                statement.setString(2, email);
                statement.executeUpdate();
            } else {
                System.err.println("Connection is null");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle SQLException appropriately
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connect != null) {
                    connect.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                // Handle SQLException on closing resources
            }
        }
    }
    
    public void updateUser(User updateuser) {
		Connection connect = null;
		PreparedStatement statement = null;
		connect = DatabaseConfig.getConnection();
		int userId = updateuser.getUser_id();
		String email = updateuser.getEmail();
		String username = updateuser.getUsername();
		String query = "update user set username = ?, email = ? where user_id=?";
		try {
			statement = connect.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, email);
			statement.setInt(3, userId);
			statement.execute();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void deleteUser(int userid) {
		Connection connect = null;
		PreparedStatement statement = null;
		connect = DatabaseConfig.getConnection();
		String query = "Delete from user where user_id=?";
		try {
			statement = connect.prepareStatement(query);
			statement.setInt(1, userid);
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    

}

