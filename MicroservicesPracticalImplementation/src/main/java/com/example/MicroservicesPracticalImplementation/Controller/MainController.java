package com.example.MicroservicesPracticalImplementation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.MicroservicesPracticalImplementation.Model.Student;
import com.example.MicroservicesPracticalImplementation.Service.StudentService;

@RestController
public class MainController {
	
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String greeting() {
		return "Hello from Spring Boot";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String greeting2() {
		return "Hello from Spring Boot Post Method";
	}
	
	
	@RequestMapping(value = "/students", method = RequestMethod.POST)
	public Student save(@RequestBody Student student) {
		return studentService.save(student);
	}
}
