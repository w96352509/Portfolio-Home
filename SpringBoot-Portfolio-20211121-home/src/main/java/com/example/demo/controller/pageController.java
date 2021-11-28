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
	
	@RequestMapping("/investor")
	public String indexinvestor() {
		
		return "investor";
	}
	
	@RequestMapping("/tstock")
	public String indextstock() {
		
		return "tstock";
	}

	@RequestMapping("/watch")
	public String indexwatch() {
		
		return "watch";
	}
}
