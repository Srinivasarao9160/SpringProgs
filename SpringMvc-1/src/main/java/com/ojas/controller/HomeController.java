package com.ojas.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String home(String name, HttpServletRequest req) {
		req.setAttribute("mname", req);
		return "home";
		
	}

}
