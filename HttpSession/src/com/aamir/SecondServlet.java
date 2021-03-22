package com.aamir;

import java.io.*;  
import javax.servlet.http.*;  
  
@SuppressWarnings("serial")
public class SecondServlet extends HttpServlet {  
  
public void doGet(HttpServletRequest request, HttpServletResponse response)  {
        try{  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        HttpSession session=request.getSession();  
        String n=(String)session.getAttribute("uname");  
        out.print("Hello "+n);  
  
        out.close();  
  
                }catch(Exception e){
                	System.out.println(e);
                	}  
    }  
      
  
}  