package com.tyrowebdev.E_Bank.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyrowebdev.E_Bank.dao.SelectEmailDAO;
import com.tyrowebdev.E_Bank.model.Users;

@WebServlet("/UserTransactionHelperServ2")
public class UserTransactionHelperServ2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SelectEmailDAO selectemaildao;

	public UserTransactionHelperServ2() {
		this.selectemaildao = new SelectEmailDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		Users existingUsers = selectemaildao.selectEmailUser(email);
		request.setAttribute("user", existingUsers);
		RequestDispatcher rd = request.getRequestDispatcher("withdrawMoney.jsp");
		rd.forward(request, response);
	}

}
