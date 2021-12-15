package com.student.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.Entity.Student;
import com.student.repo.StudentRepository;
import com.student.service.StudentService;

//simple CRUD application

@RestController
public class StudentController {

	@Autowired
	private StudentService studentservice;//inject service object
	
	@GetMapping("/getstudent")
	public String test()
	{
		return "hii..";
	}
	
	
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student student)
	{
		return studentservice.saveStudent(student);
	}
	
	//get all data
	@GetMapping("/getAllStudent")
	public List<Student> getAllStudent()
	{
		return studentservice.findAll();
	}
	
	//get by id
	@GetMapping("/getAllStudent/{id}")
	public Student getStudentByUserId(@PathVariable long id)
	{
		return studentservice.findByUserId(id);
		
				
	}
	
	//update
	@PutMapping("/updatestudent/{id}")
	public Student updateStudent(@RequestBody Student student,@PathVariable long id)
	{
		//id==6
		Student findByUserId = studentservice.findByUserId(id);
		
		findByUserId.setFirstName(student.getFirstName());//ajay
		findByUserId.setLastName(student.getLastName());//kumar
		findByUserId.setEmail(student.getEmail());//anil.kumar@gmail.com
		
		return studentservice.updateStudent(findByUserId);
	}
	
	//delete method
	@Transactional
	@DeleteMapping("/deletestudent/{id}")
	public void deleteStudent(@PathVariable long id)
	{
	 studentservice.deleteByUserId(id);
	}
	
}
