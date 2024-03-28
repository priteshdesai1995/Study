package com.example.student.database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.student.model.Student;

@Repository
public interface StudentJPA extends CrudRepository<Student, Integer> {

}
