package com.eclipse.che.springer.controller;


import org.springframework.web.servlet.ModelAndView; 
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.client.RestTemplate;
import org.apache.commons.lang.StringEscapeUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import javax.sql.DataSource;



public class RegisterController implements Controller
{

   @Override
   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
   {  
        
         
         String pw = StringEscapeUtils.escapeJava(request.getParameter("password"));
         pw = StringEscapeUtils.escapeHtml(pw);
         pw = StringEscapeUtils.escapeJavaScript(pw);
         
         String lname = request.getParameter("lname");         
         String fname = request.getParameter("fname");         
         String email = request.getParameter("email");
         ModelAndView view = new ModelAndView("redirect:/springer/admin") ;
         
         
         
         
         return view;
   
   
   
   }
}
