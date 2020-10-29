package org.hcl.controller;

import javax.validation.Valid;

import org.hcl.entities.User;
import org.hcl.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class Usercontroller1 {
	@Autowired
	private UserService userservice;
	@GetMapping("/form")
	public String showPersonsForm(Model model) {
		User user=new User();
		model.addAttribute(user);
		return "register";
	}
	@PostMapping("/process")
	public String processForm(@ModelAttribute("user") @Valid User user,BindingResult result) {
		if(result.hasErrors())
		return "register";
		userservice.insertUser(user);
		return "confirm";
	}

}
