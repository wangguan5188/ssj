package com.wangguan.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wangguan.service.UserService;

@Controller
@RequestMapping(value = "/user/")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "toLogin.html")
	public ModelAndView toLogin(ModelMap modelMap, HttpServletRequest request) {
		String username = "admin";
		String password = "e10adc3949ba59abbe56e057f20f883e";
		Map<String, Object> user = userService.queryUser(username, password);
		if(user == null) {
			System.out.println("数据表暂无管理员数据...");
		}else {
			System.out.println(user);
		}
		return new ModelAndView("login", modelMap);
	}
	
	@RequestMapping(value = "login.html")
	public ModelAndView login(ModelMap modelMap, HttpServletRequest request) {
		
		return new ModelAndView("redirect:/index.html", modelMap);
	}
	
	@RequestMapping(value = "toRegister.html")
	public ModelAndView toRegister(ModelMap modelMap, HttpServletRequest request) {
		
		return new ModelAndView("register", modelMap);
	}
	
	@RequestMapping(value = "register.html")
	public ModelAndView register(ModelMap modelMap, HttpServletRequest request) {
		
		return new ModelAndView("login", modelMap);
	}
	
}
