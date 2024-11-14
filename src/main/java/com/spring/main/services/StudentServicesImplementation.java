package com.spring.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.model.Student;
import com.spring.main.repository.StudentRepository;

@Service
public class StudentServicesImplementation implements StudentServices{
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		this.studentRepository.save(student);
		}

}
