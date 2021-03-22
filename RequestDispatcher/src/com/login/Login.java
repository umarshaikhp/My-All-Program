package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("userName");
		String pass=request.getParameter("userPass");
		if(name.equals("Aamir")&(pass.equals("1234"))){
			RequestDispatcher rd=request.getRequestDispatcher("servlet2");
			rd.forward(request, response);
		}
		else {
			out.println("<h3>user and pass wrong</h3>");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
			
		}
	}

}
