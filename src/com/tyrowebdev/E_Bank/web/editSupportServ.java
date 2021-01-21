package com.tyrowebdev.E_Bank.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyrowebdev.E_Bank.dao.selectIdDAO;
import com.tyrowebdev.E_Bank.model.Users;

@WebServlet("/editSupportServ")
public class editSupportServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private selectIdDAO selectiddao;

	public editSupportServ() {
		this.selectiddao = new selectIdDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Users existingUsers = selectiddao.selectIdUser(id);
		request.setAttribute("user", existingUsers);
		RequestDispatcher rd = request.getRequestDispatcher("EditExistingUser.jsp");
		rd.forward(request, response);
	}

}
