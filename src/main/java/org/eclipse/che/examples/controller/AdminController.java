package org.eclipse.che.examples.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.che.examples.dao.UserImpl;
  

import java.util.List;
import javax.sql.DataSource;



import org.springframework.beans.factory.annotation.Autowired;

public class AdminController implements Controller
{

   @Override
   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
   {
    
        
        ModelAndView view = new ModelAndView("login"); 
            
        view.addObject("data",request.getParameter("data"));
        
        return view;
   }
}
