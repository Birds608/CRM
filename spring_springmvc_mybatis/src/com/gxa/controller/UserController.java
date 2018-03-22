package com.gxa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gxa.model.User;
import com.gxa.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("login")
	public String login(User user,HttpSession session){
		user = userService.login(user);
		if(user != null){
			session.setAttribute("user", user);
			return "../success.jsp";
		}
		return "../login.jsp";
	}
}
