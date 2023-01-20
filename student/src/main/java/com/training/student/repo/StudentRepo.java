package com.training.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.training.student.model.Student;
@Component
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
