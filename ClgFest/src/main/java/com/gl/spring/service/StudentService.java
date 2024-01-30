package com.gl.spring.service;

import java.util.List;

import com.gl.spring.entity.Student;

public interface StudentService {
	public List<Student> findAll();

	public Student findById(int id);

	public void saveStudent(Student theStudent);

	public void deleteById(int id);

}
