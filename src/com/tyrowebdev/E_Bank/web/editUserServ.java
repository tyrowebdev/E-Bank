package com.tyrowebdev.E_Bank.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyrowebdev.E_Bank.dao.selectIdDAO;
import com.tyrowebdev.E_Bank.dao.updateUserDAO;
import com.tyrowebdev.E_Bank.model.Users;

@WebServlet("/editUserServ")
public class editUserServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private updateUserDAO updateuserdao;

	public editUserServ() {
		this.updateuserdao = new updateUserDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");

		Users user = new Users(id, name, email, address, contact);
		try {
			updateuserdao.updateUser(user);
			response.sendRedirect("adminHome.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
