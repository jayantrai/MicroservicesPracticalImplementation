package com.example.MicroservicesPracticalImplementation.Service;

import java.util.Optional;

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
	
	public Student fetchStudentById(int id) {
		Optional<Student> student = studentRepository.findById(id);
		if(student.isPresent()) {
			return student.get();
		}
		return null;
		
	}

	
}
