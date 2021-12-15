package com.student.service;

import java.util.List;

import com.student.Entity.Student;

public interface StudentService {

	Student saveStudent(Student student);

	List<Student> findAll();

	Student findByUserId(long id);


	Student updateStudent(Student findByUserId);

	void deleteByUserId(long id);

}
