package com.student.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Entity.Student;
import com.student.repo.StudentRepository;
import com.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	
	
	@Autowired
	private StudentRepository studentRepo;//dependency injection
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public List<Student> findAll() {
		return studentRepo.findAll();
	}

	@Override
	public Student findByUserId(long id) {
		return studentRepo.findByUserId(id);
	}

	@Override
	public Student updateStudent(Student findByUserId) {
		return studentRepo.save(findByUserId);
	}

	@Override
	public void deleteByUserId(long id) {
studentRepo.deleteByUserId(id);		
	}

	

}
