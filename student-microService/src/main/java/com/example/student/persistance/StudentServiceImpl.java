package com.example.student.persistance;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.student.database.StudentJPA;
import com.example.student.model.Student;
import com.example.student.service.StudentService;

@Controller
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentJPA studentRepository;

	@Override
	public <S extends Student> S save(S entity) {
		// TODO Auto-generated method stub
		return studentRepository.save(entity);
	}

	@Override
	public <S extends Student> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return studentRepository.saveAll(entities);
	}

	@Override
	public Optional<Student> findById(Integer id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return studentRepository.existsById(id);
	}

	@Override
	public Iterable<Student> findAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Iterable<Student> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return studentRepository.findAllById(ids);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return studentRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

	@Override
	public void delete(Student entity) {
		// TODO Auto-generated method stub
		studentRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		studentRepository.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends Student> entities) {
		// TODO Auto-generated method stub
		studentRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		studentRepository.deleteAll();
	}

}
