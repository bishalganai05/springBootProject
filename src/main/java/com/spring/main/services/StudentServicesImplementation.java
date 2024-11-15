package com.spring.main.services;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Student getStudentById(long id) {
		// TODO Auto-generated method stub
		Optional<Student> optional = studentRepository.findById(id);
		Student student = null;
		if(optional.isPresent())
			student = optional.get();
		else {
			throw new RuntimeException("Employee not found for id: "+id);
		}
		return student;
	}

}
