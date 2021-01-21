package com.tyrowebdev.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyrowebdev.E_Bank.dao.SelectEmailDAO;
import com.tyrowebdev.E_Bank.dao.UserLoginDAO;
import com.tyrowebdev.E_Bank.model.Users;

@WebServlet("/UserLoginServ")
public class UserLoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserLoginDAO userlogindao;

	public UserLoginServ() {
		this.userlogindao = new UserLoginDAO();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		boolean value = userlogindao.check(email, password);
		if (value) {
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			response.sendRedirect("userHome.jsp");
			
		} else {
			response.sendRedirect("userLogin.jsp");
		}

	}

}
