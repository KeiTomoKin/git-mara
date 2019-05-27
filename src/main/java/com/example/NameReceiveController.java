package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/acount")
public class NameReceiveController {
	
	@RequestMapping("")
	public String index() {
		return "input-name";
	}

	@RequestMapping("/name")
	public String inputName(String name, Model model) {
		model.addAttribute("name", name);
		return "output-name";
	}
}
