package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.BeanClass;
import com.serviceInter.ServiceInteface;
import com.serviceimple.ServiceImple;

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int status=0;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String Name=request.getParameter("name");
		String Password =request.getParameter("password");
		String Email=request.getParameter("email");
		  
		//make bean class object for set the data
		BeanClass b=new BeanClass();
		b.setName(Name);
		b.setPassword(Password);
		b.setEmail(Email);
		//Create inteface here for security ...........
		ServiceInteface sc=new ServiceImple();
		status=sc.save(b);
		if(status>0) {
			out.print("Register Your Form");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
		else
		{
			out.print("Unable To Save Record");
		}
	
}

}
