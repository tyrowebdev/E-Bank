package com.tyrowebdev.E_Bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tyrowebdev.E_Bank.model.Users;

public class deleteUserDAO {

	private String jdbcURL = "jdbc:mysql://localhost:3306/e-bank";
	private String jdbcUsername = "root";
	private String jdbcPassword = "****";

	private static final String DELETE_ID_USERS_SQL = "DELETE FROM users WHERE id =?;";

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

	public void deleteIdUser(int id) throws SQLException {
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(DELETE_ID_USERS_SQL)) {
			ps.setInt(1, id);
			ps.executeUpdate();

		}
	}
}
