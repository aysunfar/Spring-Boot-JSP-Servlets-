package com.aysun.hello.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(path="/")
	public String index() {
		return "NewFile.jsp";
	}
}