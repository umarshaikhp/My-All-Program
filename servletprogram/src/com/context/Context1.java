package com.context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/Context1")
public class Context1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		ServletConfig config=getServletConfig();
		System.out.println("config"+getServletConfig());
		
		
		 response.setContentType("text/html");
		 PrintWriter out= response.getWriter();
		 response.getWriter().write("config"+config.getInitParameter("driver"));
		 
	}

	

}