package com.marufhassan.cmsshoppingcart.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PagesController {

    @GetMapping
    public String home(Model model) {

        return "page";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
	@GetMapping("/admin") public String user()
	{
		return "admin.html";
	}

	@GetMapping("/basic") public String basic()
	{
		return "basic.html";
	}
}
