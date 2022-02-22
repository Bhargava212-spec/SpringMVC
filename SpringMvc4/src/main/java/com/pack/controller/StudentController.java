package com.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pack.model.Student;

@Controller
public class StudentController {

	@RequestMapping(value="/index")
	public String showStudentPage(ModelMap map) {
		Student  student=new Student();
		map.addAttribute("studentForm", student);
		return "student";
		
	}
	
	@RequestMapping(value="/saveStudent",method=RequestMethod.POST)
	public String storeStudent(@Validated @ModelAttribute("studentForm")Student stu,BindingResult result, ModelMap map) {
		String viewPage="";
		if(result.hasErrors()) {
			viewPage="student";
		}
		else {
			map.addAttribute("stuInfo", stu);
			viewPage="success";     
		}
		return viewPage;
		
		
		
	}
}
