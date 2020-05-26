package com.example.MicroservicesPracticalImplementation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MicroservicesPracticalImplementation.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
