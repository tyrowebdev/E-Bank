package com.tyrowebdev.E_Bank.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyrowebdev.E_Bank.dao.UpdateBalanceDAO;
import com.tyrowebdev.E_Bank.model.Users;


@WebServlet("/DepositServ")
public class DepositServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UpdateBalanceDAO updatebalancedao;  

    public DepositServ() {
      this.updatebalancedao = new UpdateBalanceDAO();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Double old_balance = Double.parseDouble(request.getParameter("balance")); 	
		Double deposit = Double.parseDouble(request.getParameter("deposit"));
		Double balance = deposit + old_balance  ;
		updatebalancedao.updateUser(balance, id);
		response.sendRedirect("userHome.jsp");
	}

}
