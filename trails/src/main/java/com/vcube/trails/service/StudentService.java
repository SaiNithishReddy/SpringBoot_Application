package com.vcube.trails.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.vcube.trails.model.Student;
import com.vcube.trails.repository.StudentRepository;

@Service
public class StudentService implements StudentInterface {
	
	@Autowired
	private StudentRepository studentRepository;
	
	// ServiceImpl class create student method
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public List<Student> getAll() {
		return studentRepository.findAll();
	}
	
	public Optional<Student> findByStudentId(long studentId){
		return studentRepository.findById(studentId);
	}
	
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
	
	public void delete(Student student){
		studentRepository.delete(student);
	}
}