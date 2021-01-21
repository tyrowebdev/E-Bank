package com.tyrowebdev.E_Bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tyrowebdev.E_Bank.model.Users;

public class selectIdDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/e-bank";
	private String jdbcUsername = "root";
	private String jdbcPassword = "admin";

	private static final String SELECT_ID_USERS_SQL = "SELECT id,name,email,password,address,contact FROM users WHERE id =?;";

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

	public Users selectIdUser(int id) {
		Users user = null;
		try (Connection con = getConnection(); 
	PreparedStatement ps = con.prepareStatement(SELECT_ID_USERS_SQL)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{ 
				String name =rs.getString("name");
				String email =rs.getString("email");
				String password = rs.getString("password");
				String address =rs.getString("address");
				String contact =rs.getString("contact");
				
				user = new Users(id, name, email, password, address, contact);
			
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}
