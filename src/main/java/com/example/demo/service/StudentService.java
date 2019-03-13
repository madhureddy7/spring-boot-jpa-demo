package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Student;
import com.example.demo.repositories.StudentRepository;

@Component
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public void saveStudent(Student student) {

		studentRepository.save(student);
	}

	public void updateStudent(Student student) {
		final Optional<Student> response = studentRepository.findById(student.getStudentId());

		if (!response.isPresent()) {
			throw new RuntimeException();
		}

		studentRepository.save(student);
	}

}
