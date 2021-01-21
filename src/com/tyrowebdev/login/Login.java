package com.tyrowebdev.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyrowebdev.E_Bank.dao.AdminLoginDAO;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private AdminLoginDAO adminlogindao;
 
    public Login() {
      this.adminlogindao = new AdminLoginDAO();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email =  request.getParameter("email");
		String password = request.getParameter("password");
		boolean value = adminlogindao.check(email, password);
		
		if(value)
		{
			HttpSession session = request.getSession();
			session.setAttribute("email",email);
			response.sendRedirect("adminHome.jsp");
		}
		
		else
		{
			response.sendRedirect("adminLogin.jsp");
		}
		
	}

}
