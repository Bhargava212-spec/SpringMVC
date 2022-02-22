package com.pack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value="/xyz")
	public String add(ModelMap m) {
		m.addAttribute("message","Spring MVC Programming");
		return "show";
	}
}
