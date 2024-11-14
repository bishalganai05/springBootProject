package com.spring.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.main.services.StudentServices;

@Controller
public class StudentController {
	@Autowired
	private StudentServices studentServices;
	//display list of students
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listStudents",studentServices.getAllStudents());
		return "index";
	}
}
