package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("search")
public class SearchController {
	@Autowired
	private UserService service;
	
	@RequestMapping("")
	public String index() {
		return "user-info-search";
	}
	@RequestMapping("/userInfo")
	public String userInfo(Integer id,Model model) {
		User user=service.load(id);
		model.addAttribute("user", user);
		return "user-info-view";
	}
}
