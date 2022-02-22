package com.pack;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public ModelAndView show() {
		return new ModelAndView("welcome","data","Hello World");
				
	}
	
	@RequestMapping(value="/abc")
	public String show1(ModelMap m) {
		m.addAttribute("message","Spring MVC Programming");
		return "success";
	}
	
	@RequestMapping(value="/hello1")
	public String show2(Map m) {
		m.put("message", "Welcome to Spring");
		
		return "success1";
	}
	
}
