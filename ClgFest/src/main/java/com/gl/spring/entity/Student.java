package com.gl.spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name= "FIRSTNAME")
	private String firstName;
	
	@Column(name= "LASTNAME")
	private String lastName;
	
	@Column(name= "COURSE")
	private String course;
	
	@Column(name= "COUNTRY")
	private String country;
	

}