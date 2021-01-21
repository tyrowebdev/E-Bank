package com.tyrowebdev.E_Bank.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyrowebdev.E_Bank.dao.UpdateBalanceDAO;

@WebServlet("/WithdrawlServ")
public class WithdrawlServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UpdateBalanceDAO updatebalancedao;

	public WithdrawlServ() {
		this.updatebalancedao = new UpdateBalanceDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	  int id = Integer.parseInt(request.getParameter("id"));
		Double ol_balance = Double.parseDouble(request.getParameter("balance"));
		Double withdraw = Double.parseDouble(request.getParameter("withdraw"));
		Double balance = ol_balance-withdraw;
		updatebalancedao.updateUser(balance, id);		
		response.sendRedirect("userHome.jsp");
	}

}
