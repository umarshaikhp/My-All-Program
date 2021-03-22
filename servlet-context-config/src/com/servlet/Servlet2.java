package com.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context=getServletContext();
		ServletConfig config=getServletConfig();
		System.out.println("servlet cotext"+getServletContext());
		response.getWriter().write("Servlet 1111111111"+context.getInitParameter("abc"));
		response.getWriter().write("Servlet 1111111111"+config.getInitParameter("xyz"));

}}
