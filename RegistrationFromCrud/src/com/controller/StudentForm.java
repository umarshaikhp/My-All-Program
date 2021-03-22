package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.BeanClass;
import com.studentInterface.StudentInterface;
import com.studentimple.StudentImplement;

@WebServlet("/StudentForm")
public class StudentForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       static int status=0;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	  PrintWriter out=response.getWriter();
	  
	  String First_Name=request.getParameter("first_name");
	  String Last_Name=request.getParameter("last_name");
	  String Password=request.getParameter("password");
	  String Address=request.getParameter("address");
	  String Contact=request.getParameter("contact"); 
	  
	  //make object of Bean class here for set values............
	  
	  BeanClass b=new BeanClass();
	  b.setFirst_Name(First_Name);
	  b.setLast_Name(Last_Name);
      b.setPassword(Password);
	  b.setAddress(Address);
	  b.setContact_No(Contact);
	  
	  // make Interface for security purpose..........
	  
	  StudentInterface sc=new StudentImplement();
	  status=sc.save(b);
	  if(status>0) {
		  out.print("Register succesfully");
		  request.getRequestDispatcher("index.jsp").include(request, response);
	  }else {
		  out.print("sorry unable to register form");
	  }
	  
	  
	  }

}
