package com.project.enduser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping(value = "/")
	public String login(Model model) {
		return "login";
	}
	@GetMapping(value = "/home")
	public String home(Model model) {
		return "home";
	}
	@GetMapping(value = "/admin")
	public String admin(Model model) {
		return "AdminLogin";
	}
	@GetMapping(value = "/shopy")
	public String shopy(Model model) {
		return "CustomerLogin";
	}
	@GetMapping(value = "/product")
	public String product(Model model) {
		return "ProductListDisplay";
	}
}