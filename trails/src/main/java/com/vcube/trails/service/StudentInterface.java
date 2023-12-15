package com.vcube.trails.service;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.vcube.trails.model.Student;

public interface StudentInterface {
	public Student createStudent(Student student);
	public List<Student> getAll();
	public Optional<Student> findByStudentId(long studentId);
	public Student save(Student student);
	public void delete(Student student);
}