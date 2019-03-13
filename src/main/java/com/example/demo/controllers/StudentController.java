package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import com.example.demo.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.example.demo.entities.Student;

@RestController
public class StudentController {
	
	@Autowired
	private  StudentService studentService;
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/student-save", method = POST)
	public void saveStudenht(@RequestBody Student student) {
		studentService.saveStudent(student);
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/student-update", method = PUT)
	public void updateStudenht(@RequestBody Student student) {
		
		studentService.updateStudent(student);
	}

}
