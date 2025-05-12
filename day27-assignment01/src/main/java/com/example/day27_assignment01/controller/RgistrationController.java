package com.example.day27_assignment01.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.day27_assignment01.model.Student;

import jakarta.validation.Valid;


@Controller
public class RgistrationController {
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("student",new Student());
		return "register";
	}
	
	@PostMapping("/register")
	public String registerStudent(@Valid Student student, BindingResult bindingResult ,Model model) {
		if(bindingResult.hasErrors()) {
			return "register";
		}
		model.addAttribute("student",new Student());
		model.addAttribute("message","Registration Successful!");
		return "register" ;
	}
}
