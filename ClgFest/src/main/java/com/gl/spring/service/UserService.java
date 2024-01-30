package com.gl.spring.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.gl.spring.dto.SignUpDto;
import com.gl.spring.entity.User;

public interface UserService  extends UserDetailsService{
	public User save(SignUpDto signUpDto);
}
