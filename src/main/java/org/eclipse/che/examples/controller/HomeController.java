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



public class HomeController implements Controller
{

   @Override
   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
   {

        RestTemplate restTemplate = new RestTemplate();
        //--- add headers using httpheaders   
         HttpHeaders httpHeaders = new HttpHeaders();
         httpHeaders.add("Content-Type", "application/json");

        // httpHeaders.add("X-Mashape-Key", "g19i88TMDjmshDi70v2wktssL4BLp1MpGyKjsnYsGGMBfbqpA7");
        
        HttpEntity <String> httpEntity = new HttpEntity <String> (null, httpHeaders);
        String query_a = "https://content.guardianapis.com/search?api-key=ce271887-f1f0-48d8-a6cd-e29ba308a01c";
        
        //--- restTemplate consumes api end
        // String feeds =  restTemplate.getForObject(query_a, java.lang.String.class , httpEntity);
        String feeds =  restTemplate.getForObject(query_a, java.lang.String.class);
        
        ModelAndView view = new ModelAndView("front_view");
        view.addObject("feeds", feeds);
        return view;
   }
}
