package org.eclipse.che.examples.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.util.List;
import javax.sql.DataSource;



public class LoginController implements Controller
{

   @Override
   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
   {
       
        
        ModelAndView view = new ModelAndView("login");
        view.addObject("msg", "Hi Login");
        return view;
   }
}
