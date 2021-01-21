package com.tyrowebdev.E_Bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tyrowebdev.E_Bank.model.Users;

public class selectAllDAO {

	private String jdbcURL = "jdbc:mysql://localhost:3306/e-bank";
	private String jdbcUsername = "root";
	private String jdbcPassword = "admin";

	private static final String SELECT_ALL_USERS_SQL = "SELECT id,name,email,address,contact FROM users;";

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

	public List<Users> selectAllUser() {
		List<Users> users = new ArrayList<>();
		try (Connection con = getConnection(); 
	PreparedStatement ps = con.prepareStatement(SELECT_ALL_USERS_SQL)) {
			ResultSet rs = ps.executeQuery();
			while(rs.next()) 
			{   
				int id = rs.getInt("id");
				String name =rs.getString("name");
				String email =rs.getString("email");
				String address =rs.getString("address");
				String contact =rs.getString("contact");
				
				users.add(new Users(id, name, email, address, contact));
			
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

}
