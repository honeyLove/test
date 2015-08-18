package com.lewis.tiger.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/simple")
public class SimpleController {
	private static final Logger log = Logger.getLogger(SimpleController.class);

	public SimpleController() {
		log.info("SimpleController is new.");
	}

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome() {
		log.info("SimpleController.welcome()");
		return "welcome";
	}

	@RequestMapping("/hello/{username}")
	public String hello(@PathVariable("username") String username, Map<String, Object> map) {
		log.info("SimpleController.hello(" + username + ")");
		map.put("userName", username.trim().toUpperCase());
		return "hello";
	}
}
