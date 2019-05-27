package com.example;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterController {
	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		return "buygoods";
	}

	@RequestMapping("total")
	public String total(Integer goods1, Integer goods2, Integer goods3) {
		int amount = goods1 + goods2 + goods3;
		application.setAttribute("amount", amount);
		application.setAttribute("tax", amount * 1.08);
		System.out.println(amount);
		return "total-price";
	}
}
