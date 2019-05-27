package com.example;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/calc")
public class CalcController {
	@Autowired
	private HttpSession session;

	@RequestMapping("")
	public String index() {
		return "input-value";
	}

	@RequestMapping("/result")
	public String result(Integer num1,Integer num2) {
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("calcResult",num1*num2);
		return "output-value";
	}

	@RequestMapping("/result2")
	public String result2() {
		return "output-value2";
	}
}
