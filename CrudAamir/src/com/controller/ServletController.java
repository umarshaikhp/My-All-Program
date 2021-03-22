package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.BeanClass;
import com.service.ServiceInterface;
import com.serviceimpl.ServiceImpliment;

@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int status=0;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String address=request.getParameter("address");
		String  mobile_number=request.getParameter("mobile_number");
		String country=request.getParameter("country");
		
		BeanClass e = new BeanClass();
		e.setName(name);
		e.setAge(age);
		e.setAddress(address);
		e.setMobile_number(mobile_number);
		e.setCountry(country);
		ServiceInterface sc=new ServiceImpliment();
		status =sc.save(e);
		if(status>0) {
			out.print("Register your form");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
		else {
			out.print("Unable to save form");
		}
		
		
		
	}

}
