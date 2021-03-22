package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.validate.Validate;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String email=request.getParameter("user_email");
		String password=request.getParameter("password");
		if(Validate.checkuser(email, password))
		{
			request.getRequestDispatcher("Welcome").forward(request, response);
		}
		else {
			out.print("<h1>Password or Email Wrong<h1>");
		}
	}

}
