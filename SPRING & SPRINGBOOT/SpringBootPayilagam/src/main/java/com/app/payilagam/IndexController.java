package com.app.payilagam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;


@Controller

public class IndexController {
	
	
	@RequestMapping("index")
	public ModelAndView index(UserDetails ud) {
		
		ModelAndView mav =new ModelAndView();
		mav.addObject("details",ud);
		mav.setViewName("index.jsp");
		//session.setAttribute("username", login);
		return mav;
	}

 }

