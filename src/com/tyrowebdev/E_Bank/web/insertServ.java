package com.tyrowebdev.E_Bank.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyrowebdev.E_Bank.dao.insertDAO;
import com.tyrowebdev.E_Bank.model.Users;

@WebServlet("/insertServ")
public class insertServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private insertDAO insertdao;

	public insertServ() {
		this.insertdao = new insertDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		String balance = request.getParameter("bal");
		
		Users newUser = new Users(name, email, password, address, contact, balance);
		
		try {
			insertdao.insertUser(newUser);
			response.sendRedirect("index.jsp");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
