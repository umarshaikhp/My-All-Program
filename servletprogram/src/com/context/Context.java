package com.context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/Context")
public class Context extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Context() {
        super();
        
    }

	public  void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		ServletContext context=getServletContext();
		System.out.println("servlet context"+getServletContext());
		System.out.println("servlet config"+getServletConfig());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		response.getWriter().write(("context"));
		String name=context.getInitParameter("driver");
		out.print(name);
	}

	
}
