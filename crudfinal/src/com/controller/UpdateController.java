package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.BeanClass;
import com.serviceimple.ServiceImplement;
import com.serviceinterface.ServiceInterface;

@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    int status=0;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String Name=request.getParameter("name");
		String Password=request.getParameter("password");
		String Email=request.getParameter("email");
		String Country=request.getParameter("country");
		BeanClass b=new BeanClass();
		b.setName(Name);
		b.setPassword(Password);
		b.setEmail(Email);
		b.setCountry(Country);
		ServiceInterface sc =new ServiceImplement();
		status=sc.update(b);
		if(status>0) {
			out.print("register form succesfully");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}else {
			out.print("sorry unable save record");
		}
		
	}


	

}
