package com.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("user_email");
		String password = request.getParameter("password");
		String conform_password = request.getParameter("cnpassword");
		if (email == null || email.trim().length() == 0) {
			out.print("fill user name");
			request.getRequestDispatcher("index.jsp").include(request, response);
			return;
		}
		if (password == null || password.trim().length() == 0) {
			out.print("fill password");
			request.getRequestDispatcher("index.jsp").include(request, response);
			return;
		}
		if (conform_password == null || conform_password.trim().length() == 0) {
			out.print("fill confrom_password");
			request.getRequestDispatcher("index.jsp").include(request, response);
			return;
		}
		if(password.equals(conform_password)) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","root");
				PreparedStatement p=con.prepareStatement("insert into validationform values(?,?,?)");
				p.setString(1, email);
				p.setString(2, password);
				p.setString(3, conform_password);
				int i=p.executeUpdate();
				if(i>0)
				{
					out.print("succesfully ragister");
					request.getRequestDispatcher("index.jsp").include(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else
		{
			out.print("both password should be same");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
	}

}
