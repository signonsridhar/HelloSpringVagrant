package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/say")
public class SayController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome2(ModelMap model) {
		model.addAttribute("message", "Spring MVC Hello World Say2");
		return "say";
	}
}
