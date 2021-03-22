package com.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Register extends HttpServlet {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user_name = request.getParameter("user_name");
		String user_password = request.getParameter("user_password");
		String user_email = request.getParameter("user_email");
		HttpSession se=request.getSession();
		se.setAttribute("uname", user_name);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(user_name);
		out.println(user_password);
		out.println(user_email);
		out.println("run");
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root","root");
			String q = "insert into user (name,password,email)values (?,?,?)";
			PreparedStatement p = con.prepareStatement(q);
			p.setString(1, user_name);
			p.setString(2, user_password);
			p.setString(3, user_email);
			p.executeUpdate();
			out.println("succes");

		} catch (Exception e) {
			e.printStackTrace();
			
		}
		request.getRequestDispatcher("welcome.jsp").forward(request, response);

	}

}
