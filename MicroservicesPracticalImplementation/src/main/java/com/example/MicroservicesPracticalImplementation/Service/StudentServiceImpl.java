package com.example.MicroservicesPracticalImplementation.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MicroservicesPracticalImplementation.Model.Student;
import com.example.MicroservicesPracticalImplementation.Repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	StudentRepository studentRepository;
	

	public Student save(Student student) {
		return studentRepository.save(student);
	}

	
}
