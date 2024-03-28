package com.example.demo.database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
