package org.hcl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.hcl.dao.UserDao;
import org.hcl.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private UserDao userdao;
	@GetMapping("/form")
	
	public String getLoginPage(Model model) {
	User user=new  User();
	model.addAttribute("user", user);
	return "login";
	}
	
	@PostMapping("/processlogin")
	public String getProfilepage(@Valid @ModelAttribute("user") User user,BindingResult result,HttpServletRequest request,Model model) {
	User validUser=userdao.verifyUser(user);
	if(validUser!=null) {
	HttpSession session = request.getSession();
	session.setAttribute("validUser", validUser);
	model.addAttribute("validUser",session.getAttribute("validUser"));
	return "success";	
	
	}
	return "home";
	
			
		
	}
}
