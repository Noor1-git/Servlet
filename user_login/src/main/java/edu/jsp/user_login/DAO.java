package edu.jsp.user_login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	
	public boolean register(User user) {
		
		String username=user.getName();
		String email=user.getEmail();
		String password=user.getPassword();
		
		String dbuser="postgres";
		String dbpass="root";
		String dburl="jdbc:postgresql://localhost:5432/servlet_login";
		
		boolean result=true;
		
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection connection=DriverManager.getConnection(dburl, dbuser, dbpass);
			
			String query="INSERT INTO users (name, email, password, role)"+
					"VALUES ('"+username+"', '"+email+"', '"+password+"', 'user')";
			
			Statement statement=connection.createStatement();
			
			statement.execute(query);
			
			System.out.println("Inserted");
			
			connection.close();
			statement.close();
			return result;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			result=false;
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			result=false;
			return result;
		}
	}
	
	public boolean login(User user) {
		String email=user.getEmail();
		String pass=user.getPassword();
		
		String dbuser="postgres";
		String dbpass="root";
		String dburl="jdbc:postgresql://localhost:5432/servlet_login";
		
		boolean result=true;
		
		
			try {
				Class.forName("org.postgresql.Driver");
				Connection connection=DriverManager.getConnection(dburl, dbuser, dbpass);
				String query="SELECT * FROM users WHERE email='"+email+"'";
				
				Statement statement=connection.createStatement();
				
				ResultSet resultSet=statement.executeQuery(query);
				String password="";
				while(resultSet.next()) {
					password=resultSet.getString(4);
				}
				if (pass.equals(password)) {
					return result;
				} else {
					result=false;
					return result;
				}
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				result=false;
				return result;
			} catch (SQLException e) {
				e.printStackTrace();
				result=false;
				return result;
			}
	}
}