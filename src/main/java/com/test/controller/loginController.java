package com.test.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.cookie;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.net.HttpCookie;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.aspectj.apache.bcel.generic.ReturnaddressType;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.pojo.User;
import com.test.service.login;

@Controller
@RequestMapping("")
public class loginController {
	@Autowired
	private login  login;
	@RequestMapping("/login")
   public ModelAndView loginOpercation(HttpSession session,HttpServletRequest request,HttpServletResponse response){ 
	    User user = new User();
		user.setuName(request.getAttribute("name").toString());
		user.setuPassword(request.getAttribute("password").toString());
	    List<User> list = login.login(user);
	    ModelAndView modelAndView = new ModelAndView("index.jsp");
	    Cookie[] c = request.getCookies();
        if (list.size()!=0&&list.size()>0||c.length!=0) {
            
        	modelAndView.addObject("message","AAAAAAAAAAA");
        	Integer i=((Integer)session.getAttribute("ccount"))>0?0:+1;
           return modelAndView;
			
	}
        	return modelAndView; }
//   public ModelAndView reginsterOpercation() {}
    		
}
