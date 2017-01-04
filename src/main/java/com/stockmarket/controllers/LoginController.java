package com.stockmarket.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock-market")
public class LoginController {
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String userAuthentication(@RequestParam("uname") String user) {
		return "Hi "+user;
}
}
