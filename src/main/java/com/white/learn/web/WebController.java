package com.white.learn.web;

import com.white.learn.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@RequestMapping("/hello")
	public String hello(String name) {
		return "hello word!!! |name=>" + name;
	}

	@RequestMapping(value = "/user/get/{name}", method = RequestMethod.POST)
	public User getUser(@PathVariable String name) {
		User user = new User(name, 18, "1234");
		return user;
	}

	@RequestMapping(value = "/user/save")
	public String saveUser(User user, BindingResult result) {
		System.out.println("user: " + user);
		if (result.hasErrors()) {
			for (ObjectError err : result.getAllErrors()) {
				System.out.println(err.getCode() + ":" + err.getDefaultMessage());
			}
		}
		return "OK!";
	}
}
