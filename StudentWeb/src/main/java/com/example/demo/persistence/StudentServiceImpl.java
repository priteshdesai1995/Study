package com.example.demo.persistence;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.database.StudentRepository;
import com.example.demo.dto.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public <S extends Student> S save(S entity) {
		return studentRepository.save(entity);
	}

	@Override
	public <S extends Student> Iterable<S> saveAll(Iterable<S> entities) {
		return studentRepository.saveAll(entities);
	}

	@Override
	public Optional<Student> findById(Integer id) {
		return studentRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return studentRepository.existsById(id);
	}

	@Override
	public Iterable<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Iterable<Student> findAllById(Iterable<Integer> ids) {
		return studentRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return studentRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		studentRepository.deleteById(id);
	}

	@Override
	public void delete(Student entity) {
		studentRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		studentRepository.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends Student> entities) {
		studentRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		studentRepository.deleteAll();
	}
}
