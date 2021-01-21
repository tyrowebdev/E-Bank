package com.tyrowebdev.E_Bank.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyrowebdev.E_Bank.dao.deleteUserDAO;


@WebServlet("/DeleteServ")
public class DeleteServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private deleteUserDAO deleteuserdao;
   
    public DeleteServ() {
        this.deleteuserdao = new deleteUserDAO();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			deleteuserdao.deleteIdUser(id);
			response.sendRedirect("adminHome.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
