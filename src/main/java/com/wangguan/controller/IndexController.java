package com.wangguan.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping(value = "index.html")
	public ModelAndView index(ModelMap modelMap, HttpServletRequest request) {
		
		return new ModelAndView("index", modelMap);
	}
	
	@RequestMapping(value = "hello.html")
	public ModelAndView hello(ModelMap modelMap, HttpServletRequest request) {
		
		return new ModelAndView("hello", modelMap);
	}
	
	@RequestMapping(value = "world.html")
	public ModelAndView world(ModelMap modelMap, HttpServletRequest request) {
		
		return new ModelAndView("world", modelMap);
	}
	
}
