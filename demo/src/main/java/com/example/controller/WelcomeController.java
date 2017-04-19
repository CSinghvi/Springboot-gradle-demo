package com.example.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	

	@RequestMapping(value="/controller.do", method=RequestMethod.GET)
	public ModelAndView welcome() {
//		model.put("time", new Date());
//		model.put("message", "Hi hope you aregood and glad its working!!");
		ModelAndView model=new ModelAndView();
		model.setViewName("welcome");
		return model;
	}

//	@RequestMapping("/foo")
//	public String foo(Map<String, Object> model) {
//		throw new RuntimeException("Foo");
//	}

}