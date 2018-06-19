package com.eclipse.che.springer.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eclipse.che.springer.dao.UserImpl;
import com.eclipse.che.springer.dao.UserDao;

import com.eclipse.che.springer.dto.User;
  

import java.util.List;
import javax.sql.DataSource;



import org.springframework.beans.factory.annotation.Autowired;

public class AdminController implements Controller
{

   @Autowired
	private UserImpl userUtil;
	
   @Override
   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
   {
       
      
        User u =  this.userUtil.readUser(1);
        
        ModelAndView view = new ModelAndView("login"); 
            
             
        
        return view;   

   }
}
