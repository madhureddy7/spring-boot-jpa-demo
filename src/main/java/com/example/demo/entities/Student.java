package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Details")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="student_Id")
	private String studentId;
	
	@Column(name="student_branch")
	private String branch;
	
	
	@Column(name="student_college")
	private String college;
	
	
	
	public Student() {
		super();
	}
	
	public Student(String studentId, String branch, String college) {
		super();
		this.studentId = studentId;
		this.branch = branch;
		this.college = college;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	
}
