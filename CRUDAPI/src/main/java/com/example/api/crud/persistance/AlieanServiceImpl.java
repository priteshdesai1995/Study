package com.example.api.crud.persistance;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.api.crud.database.AlieanRepository;
import com.example.api.crud.model.Aliean;
import com.example.api.crud.service.AlieanService;

@Controller
public class AlieanServiceImpl implements AlieanService {

	@Autowired
	AlieanRepository alieanRepository;

	@Override
	public <S extends Aliean> S save(S entity) {
		// TODO Auto-generated method stub
		return alieanRepository.save(entity);
	}

	@Override
	public <S extends Aliean> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return alieanRepository.saveAll(entities);
	}

	@Override
	public Optional<Aliean> findById(Long id) {
		// TODO Auto-generated method stub
		return alieanRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return alieanRepository.existsById(id);
	}

	@Override
	public Iterable<Aliean> findAll() {
		// TODO Auto-generated method stub
		return alieanRepository.findAll();
	}

	@Override
	public Iterable<Aliean> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return alieanRepository.findAllById(ids);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return alieanRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		alieanRepository.deleteById(id);
	}

	@Override
	public void delete(Aliean entity) {
		// TODO Auto-generated method stub
		alieanRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		alieanRepository.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends Aliean> entities) {
		// TODO Auto-generated method stub
		alieanRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		alieanRepository.deleteAll();
	}

}
