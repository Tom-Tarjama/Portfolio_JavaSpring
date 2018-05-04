package com.codingdojo.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("")
	public String index() {
		return "forward: /index.html";
	}
	
	@RequestMapping("about")
	public String aboutMe() {
		return "forward: /aboutMe.html";
	}
	
	@RequestMapping("projects")
	public String projects() {
		return "forward: /projects.html";
	}

}
