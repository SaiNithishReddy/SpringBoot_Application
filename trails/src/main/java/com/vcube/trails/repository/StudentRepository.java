package com.vcube.trails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vcube.trails.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}