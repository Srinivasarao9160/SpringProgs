package com.login.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("myHome")
	public ModelAndView myHome() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("wish", "welcome");
		mv.setViewName("myHome");
		return mv;
	}
	
//	@RequestMapping("mylog")
//	public ModelAndView myLog() {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("tnk", "Thank you");
//		mv.setViewName("mylog");
//		return mv;
//	}
		
		@RequestMapping(value="myHome",method=RequestMethod.POST)
	public ModelAndView disp(HttpServletRequest req) {
		String uname = req.getParameter("uname");
		String upass = req.getParameter("upass");
		ModelAndView mv = new ModelAndView();
		if(uname.equalsIgnoreCase("java") && upass.equalsIgnoreCase("ojas")) {
			mv.addObject("st","valid user");
		}
		else{
			mv.addObject("st", " in valid user");
		}
		mv.setViewName("mypage");
		return mv;
		}
	}



