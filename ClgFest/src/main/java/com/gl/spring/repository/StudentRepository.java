package com.gl.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.spring.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
