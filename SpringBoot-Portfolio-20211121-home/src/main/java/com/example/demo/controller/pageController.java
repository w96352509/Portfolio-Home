package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class pageController {

	@RequestMapping("/home")
	public String getHomepage() {

		return "home";
	}

	@RequestMapping("/classify")
	public String index() {

		return "classify";
	}

}
