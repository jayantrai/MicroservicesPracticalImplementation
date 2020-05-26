package com.example.MicroservicesPracticalImplementation.Service;



import com.example.MicroservicesPracticalImplementation.Model.Student;

public interface StudentService {
	
	Student save(Student student);
	Student fetchStudentById(int id);
}
