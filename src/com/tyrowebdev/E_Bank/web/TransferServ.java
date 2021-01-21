package com.tyrowebdev.E_Bank.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyrowebdev.E_Bank.dao.SelectEmailDAO;
import com.tyrowebdev.E_Bank.dao.UpdateBalanceDAO;
import com.tyrowebdev.E_Bank.model.Users;

@WebServlet("/TransferServ")
public class TransferServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SelectEmailDAO selectemaildao;
	private UpdateBalanceDAO updateBalanceDAO;

	public TransferServ() {
		this.selectemaildao = new SelectEmailDAO();
		this.updateBalanceDAO = new UpdateBalanceDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int rece_id = Integer.parseInt(request.getParameter("rece_id"));
		String email = request.getParameter("rece_email");
		Double amount = Double.parseDouble(request.getParameter("amount"));
		Users user = selectemaildao.selectEmailUser(email);
		Double old_balance = Double.parseDouble(user.getBalance());
		Double balance = old_balance + amount;
		updateBalanceDAO.updateUser(balance, rece_id);

		int sender_id = Integer.parseInt(request.getParameter("sender_id"));
		Double sender_balance = Double.parseDouble(request.getParameter("sender_balance"));
		Double sender_balance2 = sender_balance - amount;
		updateBalanceDAO.updateUser(sender_balance2, sender_id);

		response.sendRedirect("userHome.jsp");

	}

}
