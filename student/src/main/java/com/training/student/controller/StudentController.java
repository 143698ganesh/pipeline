package com.training.student.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.student.model.Student;
import com.training.student.service.StudentService;

@RequestMapping("/student")
@RestController
public class StudentController {
	
	@Autowired(required=true)
	StudentService service;
	
	@PostMapping("/new")
	public Student addStudent(@RequestBody Student student) {
		return service.createStudent(student);
	}
	@GetMapping("/get/{rollno}")
	public Optional<Student> ShowStudent(@PathVariable int rollno ) {
		return service.getStudent(rollno);
	}

}
