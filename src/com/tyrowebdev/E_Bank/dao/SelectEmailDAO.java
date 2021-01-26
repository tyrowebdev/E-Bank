package com.tyrowebdev.E_Bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tyrowebdev.E_Bank.model.Users;

public class SelectEmailDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/e-bank";
	private String jdbcUsername = "root";
	private String jdbcPassword = "****";

	private static final String SELECT_EMAIL_USERS_SQL = "SELECT id,name,email,password,address,contact,balance FROM users WHERE email =?;";

	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;

	}

	public Users selectEmailUser(String email) {
		Users user = null;
		try (Connection con = getConnection(); 
	PreparedStatement ps = con.prepareStatement(SELECT_EMAIL_USERS_SQL)) {
			ps.setString(1,email);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{   int id = rs.getInt("id");
				String name =rs.getString("name");
				String Email =rs.getString("email");
				String password = rs.getString("password");
				String address =rs.getString("address");
				String contact =rs.getString("contact");
				String balance = rs.getString("balance");
				
			user = new Users(id, name, Email, password, address, contact, balance);
			
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}
