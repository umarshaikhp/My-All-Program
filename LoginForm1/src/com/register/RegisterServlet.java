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
		response.setContentType("text.html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");
		String cond = request.getParameter("condition");
		System.out.println(name);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Registration","root","root");
			PreparedStatement p=con.prepareStatement("inset into USER value(?,?,?,?,?,?) ");
			p.setString(1, name);
			p.setString(2, password);
			p.setString(3, email);
			p.setString(4, gender);
			p.setString(5, course);
			p.setString(6, cond);
			int i=p.executeUpdate();
			if(i>0) {
				out.println("register");
				request.getRequestDispatcher("index.html").forward(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
