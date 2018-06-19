package com.eclipse.che.springer.controller;


import org.springframework.web.servlet.ModelAndView; 
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.client.RestTemplate;
import org.apache.commons.lang.StringEscapeUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.eclipse.che.springer.dto.User;
import com.eclipse.che.springer.dao.UserImpl;

import org.springframework.beans.factory.annotation.Autowired;


public class RegisterController implements Controller
{
   @Autowired
   private UserImpl userUtil;
   
   @Override
   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
   {  
        
         
         String pw = StringEscapeUtils.escapeJava(request.getParameter("password"));
         pw = StringEscapeUtils.escapeHtml(pw);
         pw = StringEscapeUtils.escapeJavaScript(pw);
         
         String lname = StringEscapeUtils.escapeJava(request.getParameter("lname"));
         lname = StringEscapeUtils.escapeHtml(lname);
         lname = StringEscapeUtils.escapeJavaScript(lname);
         
         String fname = StringEscapeUtils.escapeJava(request.getParameter("fname"));
         fname = StringEscapeUtils.escapeHtml(fname);
         fname = StringEscapeUtils.escapeJavaScript(fname);
         
         String email = StringEscapeUtils.escapeJava(request.getParameter("email"));
         email = StringEscapeUtils.escapeHtml(email);
         email = StringEscapeUtils.escapeJavaScript(email);
         
         User u = new User();         
         u.setFirstname(fname);         
         u.setLastname(lname);         
         u.setEmail(email);                  
         u.setPassword(pw);         
         u.setIsAdmin(0);
         
         int rows = userUtil.addUser(u);
         
         User ua = new User();
         if(rows == 1 ){
           ua = userUtil.readUserByEmail(u.getEmail());
         }
         
         ModelAndView view = new ModelAndView("redirect:/springer/admin") ;
               
         view.addObject("data", ua.getId());    
         
         
         
         return view;
   
   
   
   }
}
