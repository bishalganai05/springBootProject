package com.spring.main.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_Table")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
    @SequenceGenerator(name = "emp_seq", sequenceName = "emp_sequence", initialValue = 1000, allocationSize = 1)
	@Column
	private long studentID;
	
	@Column(name = "Student Name")
	private String studentName;
	
	@Column(name = "Student Email Address")
	private String emailID;
	
	@Column(name = "Student Address")
	private String location;

	public Student(String studentName, String emailID, String location) {
		this.studentName = studentName;
		this.emailID = emailID;
		this.location = location;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public long getStudentID() {
		return studentID;
	}

	

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
