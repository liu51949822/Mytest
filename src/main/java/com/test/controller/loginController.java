package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.service.login;

@Controller
@RequestMapping("")
public class loginController {
	@Autowired
	private login  login;
	@RequestMapping("/login")
   public ModelAndView loginOpercation() {}
   public ModelAndView reginsterOpercation() {}
}
