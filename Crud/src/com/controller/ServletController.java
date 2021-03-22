package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.BeanClass;
import com.dao.DaoInterface;
import com.service.ServiceInterface;
import com.serviceimpl.ServiceImplement;

@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       static int status=0;
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)   
	         throws ServletException, IOException {  
	        response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	          
	        String name=request.getParameter("name"); 
	        String email=request.getParameter("email");  
	        String country=request.getParameter("country");  
	        
	        //create  here bean class object or Setter  Getter object for set data   
	        BeanClass b=new BeanClass();
	        
	        b.setName(name);  
	        b.setEmail(email);  
	        b.setCountry(country);  
	        ServiceInterface sc=new ServiceImplement();
	        status=sc.save(b); 
	        if(status>0){  
	            out.print("<p>Record saved successfully!</p>");  
	            request.getRequestDispatcher("index.jsp").include(request, response);  
	        }else{  
	            out.println("Sorry! unable to save record");  
	        }  
	          
	        out.close();  
	    }  
	  
	} 