package org.hcl.controller;

import org.hcl.entities.PetDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {
	@RequestMapping("/pet")
	public String showPet(Model model) {
		PetDetails petdetails=new PetDetails();
		model.addAttribute(petdetails);
		return "pet";
		
	}

}
