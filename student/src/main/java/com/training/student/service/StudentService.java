package com.training.student.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.student.model.Student;
import com.training.student.repo.StudentRepo;
@Service
public class StudentService {
	@Autowired(required=true)
	StudentRepo repo;

	public Student createStudent(Student student) {
		return repo.save(student);
	}

	public Optional<Student> getStudent(int rollno) {
		
		return repo.findById(rollno);
	}

}
