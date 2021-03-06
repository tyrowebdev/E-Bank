package com.tyrowebdev.E_Bank.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tyrowebdev.E_Bank.dao.selectAllDAO;
import com.tyrowebdev.E_Bank.model.Users;


@WebServlet("/ViewAllWithDeleteServ")
public class ViewAllWithDeleteServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private selectAllDAO  selectalldao ; 
    
    public ViewAllWithDeleteServ() {
    	 this.selectalldao = new selectAllDAO();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Users> showAllUsers = selectalldao.selectAllUser() ;
		request.setAttribute("showAllUsers", showAllUsers);	
		RequestDispatcher rd = request.getRequestDispatcher("ShowAllUsersWithDelete.jsp");
		rd.forward(request, response);
	}

}
