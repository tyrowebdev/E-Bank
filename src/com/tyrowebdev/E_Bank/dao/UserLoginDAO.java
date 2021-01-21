package com.tyrowebdev.E_Bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tyrowebdev.E_Bank.model.Users;

public class UserLoginDAO {

	private String jdbcURL = "jdbc:mysql://localhost:3306/e-bank";
	private String jdbcUsername = "root";
	private String jdbcPassword = "admin";

	private static final String CHECK_USER = " SELECT * FROM users  WHERE email = ? AND password = ? ;";
	
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

	public boolean check(String email, String password) {
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(CHECK_USER)) {	
			ps.setString(1,email);
			ps.setString(2,password);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}

}
