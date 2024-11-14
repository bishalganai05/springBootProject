package com.spring.main.services;

import java.util.List;

import com.spring.main.model.Student;

public interface StudentServices {
	List<Student> getAllStudents();
	void addStudent(Student student);
}
