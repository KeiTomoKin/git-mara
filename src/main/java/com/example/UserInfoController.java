package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/info")
public class UserInfoController {
	@ModelAttribute
	public User setUpForm() {
		return new User();
	}

	@RequestMapping("")
	public String index() {
		return "input-user-info";
	}

	@RequestMapping("/output")
	public String inputName(User user, Model model) {
		model.addAttribute("user", user);
		return "output-user-info";
	}
}
