package com.example.api.userdetails.presistance;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.api.userdetails.database.UserDetailsRepository;
import com.example.api.userdetails.mode.UserDetails;
import com.example.api.userdetails.service.UserService;

@Controller
public class UserServiceImpl implements UserService {

	@Autowired
	UserDetailsRepository userService;

	@Override
	public <S extends UserDetails> S save(S entity) {
		// TODO Auto-generated method stub
		return userService.save(entity);
	}

	@Override
	public <S extends UserDetails> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return userService.saveAll(entities);
	}

	@Override
	public Optional<UserDetails> findById(Long id) {
		// TODO Auto-generated method stub
		return userService.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return userService.existsById(id);
	}

	@Override
	public Iterable<UserDetails> findAll() {
		// TODO Auto-generated method stub
		return userService.findAll();
	}

	@Override
	public Iterable<UserDetails> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return userService.findAllById(ids);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return userService.count();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		userService.deleteById(id);
	}

	@Override
	public void delete(UserDetails entity) {
		// TODO Auto-generated method stub
		userService.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		userService.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends UserDetails> entities) {
		// TODO Auto-generated method stub
		userService.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		userService.deleteAll();
	}

}
