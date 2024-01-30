package com.gl.spring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.spring.entity.Student;
import com.gl.spring.service.StudentService;


@Controller
@RequestMapping("/students")
public class StudentController {
	StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping("/list")
	public String listStudents(Model model) {
		List<Student> students = studentService.findAll();
		model.addAttribute("students", students);
		for (Student student : students) {
			System.err.println(student.getId() + student.getFirstName() + student.getLastName() + student.getCourse() + student.getCountry());
		}
		return "student/student-list";
	}
	@GetMapping("/showStudentFormForAdd")
	public String showStudentForm(Model model) {
		Student student = new Student();

		model.addAttribute("student", student);
		return "student/student-form";
	}
	@GetMapping("/studentFormForEdit/{id}")
	public String showStudentFormForEdit(Model model, @PathVariable int  id) {
		Student student = studentService.findById(id);
		model.addAttribute("student", student);
		return "student/student-form";
	}
	@GetMapping("/delete/{student_id}")
	public String delete(Model model, @PathVariable int id) {
		studentService.deleteById(id);
		return "redirect:/students/list";
	}
	@PostMapping("/saveStudent")
	public String saveStudent(Model model, @ModelAttribute("student") Student student) {
		studentService.saveStudent(student);

		return "redirect:/students/list";
	}

}
