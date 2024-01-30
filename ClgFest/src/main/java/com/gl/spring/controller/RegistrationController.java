package com.gl.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.gl.spring.dto.SignUpDto;
import com.gl.spring.entity.User;
import com.gl.spring.service.UserService;


@Controller
public class RegistrationController {
	@Autowired
	private UserService userService;

	@GetMapping("/registration")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		return "registration";
	}
	@PostMapping("/regSuccess")
	public String regUser(Model model, @ModelAttribute SignUpDto signUpDto) {
		userService.save(signUpDto);
		return "redirect:/registration?success";	}

}
