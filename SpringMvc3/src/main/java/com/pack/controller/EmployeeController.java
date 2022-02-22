package com.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pack.model.Employee;

@Controller
public class EmployeeController {
   
	@RequestMapping(value="/redirect")
	public String showEmployeePage(ModelMap map) {
		Employee emp=new Employee();
		map.addAttribute("empForm", emp);
		return "insertEmployee";
		
	}
	@RequestMapping(value="/insertEmp",method=RequestMethod.POST)
	public String storeEmployee(@ModelAttribute("empForm")Employee emp,ModelMap map) {
		map.addAttribute("empInfo", emp);
		return "displayEmployee" ;
	}
}
