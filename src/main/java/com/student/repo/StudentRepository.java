package com.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.student.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	
	Student findByUserId(long id);


	void deleteByUserId(long id);



}
