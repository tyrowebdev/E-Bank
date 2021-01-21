package com.tyrowebdev.E_Bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.catalina.User;

import com.mysql.jdbc.Driver;
import com.tyrowebdev.E_Bank.model.Users;

public class insertDAO {

	private String jdbcURL = "jdbc:mysql://localhost:3306/e-bank";
	private String jdbcUsername = "root";
	private String jdbcPassword = "admin";

	private static final String INSERT_USERS_SQL = "INSERT INTO users(name,email,password,address,contact,balance)VALUES(?,?,?,?,?,?);";

	protected Connection getConnection() 
	{
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
	
	public void insertUser(Users user) 
	{
	 try(Connection con = getConnection();
	PreparedStatement ps = con.prepareStatement(INSERT_USERS_SQL)){
		ps.setString(1, user.getName()); 
		ps.setString(2, user.getEmail()); 
		ps.setString(3, user.getPassword()); 
		ps.setString(4, user.getAddress()); 
		ps.setString(5, user.getContact()); 
		ps.setString(6, user.getBalance()); 
		ps.executeUpdate();
	 } catch (SQLException e) {
		e.printStackTrace();
	}
	}
	
	
		
}
