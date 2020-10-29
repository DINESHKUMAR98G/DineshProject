package org.hcl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
	@RequestMapping("/")
	public String showRegister()
	{
		return "home";
	}
	
	@RequestMapping("/logout")

	public String logout(HttpServletRequest request,RedirectAttributes redirectAttributes) 
	{

	HttpSession session = request.getSession(false);

	session.invalidate();

	redirectAttributes.addFlashAttribute("message","you are sucessfully logged out");

	return "redirect:/";
	}
}
