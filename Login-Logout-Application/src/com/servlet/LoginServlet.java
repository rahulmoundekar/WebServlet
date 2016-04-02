package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	/**
	 * @author Rahul Moundekar
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		 String uname=request.getParameter("userName");
		String password=request.getParameter("password");
		 if(uname.equals("rahul") && password.equals(uname))
		 {
			 System.out.println(uname);
			 HttpSession session = request.getSession();
			 session.setAttribute("session_uname",uname);
			 request.getRequestDispatcher("success.jsp").forward(request, response);
		 }
		 else
		 {
			 request.setAttribute("error", "Username Password Wrong");
			 request.getRequestDispatcher("index.jsp").forward(request, response);
		 }
	}
}
