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
		String name = request.getParameter("user_name");
		String email = request.getParameter("user_email");
		String password = request.getParameter("password");
		String conform_password = request.getParameter("cnpassword");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");
		String condition = request.getParameter("condition");
		if (name == null || name.trim().length() == 0) {
			out.print("<h1>Fill Name<h1>");
			request.getRequestDispatcher("index.jsp").include(request, response);
			return;
		}
		if (email == null || email.trim().length() == 0) {
			out.print("<h1>Fill Email<h1>");
			request.getRequestDispatcher("index.jsp").include(request, response);
			return;
		}
		if (password == null || password.trim().length() == 0) {
			out.print("<h1>Fill Password<h1>");
			request.getRequestDispatcher("index.jsp").include(request, response);
			return;
		}
		if (conform_password == null || conform_password.trim().length() == 0) {
			out.print("<h1>Fill Conform Password<h1>");
			request.getRequestDispatcher("index.jsp").include(request, response);
			return;
		}
		if (gender == null || gender.trim().length() == 0) {
			out.print("<h1>Choose Gender<h1>");
			request.getRequestDispatcher("index.jsp").include(request, response);
			return;
		}

		if (password.equals(conform_password)) {
			if (condition == null) {
				out.print("<h1>cheq condition<h1>");
				request.getRequestDispatcher("index.jsp").include(request, response);
				return;
			}
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root",
						"root");
				PreparedStatement p = con.prepareStatement("insert into validation2 values (?,?,?,?,?,?,?)");
				p.setString(1, name);
				p.setString(2, email);
				p.setString(3, password);
				p.setString(4, conform_password);
				p.setString(5, gender);
				p.setString(6, course);
				p.setString(7, condition);
				int i = p.executeUpdate();
				if (i > 0) {
					out.print("<h1>Successfully Register<h1>");
					request.getRequestDispatcher("index.jsp").include(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			out.print("<h1>Both password should be match<h1>");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}

	}

}
