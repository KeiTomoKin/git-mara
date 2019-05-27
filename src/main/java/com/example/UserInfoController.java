package com.example;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userInfo")
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
	public String outputName(UserForm userForm, Model model) {
		User user = new User();
		model.addAttribute("user", user);
		BeanUtils.copyProperties(userForm, user);
		return "output-user-info";
	}
}
