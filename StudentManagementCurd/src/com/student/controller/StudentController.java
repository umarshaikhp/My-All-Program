package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.Bean.StudentBean;
import com.student.Service.StudentServiceInterface;
import com.student.serviceimpl.StudentServiceImpl;


@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       int status=0;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("Name");
		String address=request.getParameter("Address");
		String email=request.getParameter("Email");
		String age=request.getParameter("Age");
		String mobile_no=request.getParameter("Mobile_no");
		
		StudentBean studentbean=new StudentBean();
		studentbean.setName(name);
		studentbean.setAddress(address);
		studentbean.setEmail(email);
		studentbean.setAge(age);
		studentbean.setMobile_no(mobile_no);
		
		StudentServiceInterface sc=new StudentServiceImpl();
		status=sc.Insert(studentbean);
		
		if(status !=0) {
			 out.print("<p>Record saved successfully!</p>");  
	            request.getRequestDispatcher("Student.jsp").include(request, response);  
	        }else{  
	            out.println("Sorry! unable to save record");  
	        }  
		}

}
