package com.tyrowebdev.E_Bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tyrowebdev.E_Bank.model.Users;

public class UpdateBalanceDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/e-bank";
	private String jdbcUsername = "root";
	private String jdbcPassword = "****";

	private static final String UPDATE_BALANCE_SQL = "UPDATE users SET balance=? WHERE id=? ; ";

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

	public void updateUser(Double balance,int id) {
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(UPDATE_BALANCE_SQL)) {
			ps.setDouble(1,balance);
			ps.setInt(2,id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
