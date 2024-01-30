package com.gl.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gl.spring.entity.Student;
import com.gl.spring.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	StudentRepository studentRepository;
	private StudentRepository StudentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.StudentRepository = studentRepository;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return StudentRepository.findAll();
	}

	@Override
	public Student findById(int id) {
		Optional<Student> result = studentRepository.findById(id);
		Student theStudent = null;
		if (result.isPresent())
			theStudent = result.get();
		else
			throw new RuntimeException("Given Student with the id is not present " + id);
		return theStudent;
	}

	@Override
	public void saveStudent(Student theStudent) {
		studentRepository.save(theStudent);

	}

	@Override
	public void deleteById(int id) {
		studentRepository.deleteById(id);

	}

}
