package com.white.learn.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	public String hello(ModelMap map) {
		map.addAttribute("name", "neo");
		return "hello";
	}
}
