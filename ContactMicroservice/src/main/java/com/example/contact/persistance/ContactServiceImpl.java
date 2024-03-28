package com.example.contact.persistance;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.contact.database.ContactRepository;
import com.example.contact.model.Contact;
import com.example.contact.service.ContactService;

@Controller
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepository contactRepository;

	@Override
	public <S extends Contact> S save(S entity) {
		// TODO Auto-generated method stub
		return contactRepository.save(entity);
	}

	@Override
	public <S extends Contact> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return contactRepository.saveAll(entities);
	}

	@Override
	public Optional<Contact> findById(Long id) {
		// TODO Auto-generated method stub
		return contactRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return contactRepository.existsById(id);
	}

	@Override
	public Iterable<Contact> findAll() {
		// TODO Auto-generated method stub
		return contactRepository.findAll();
	}

	@Override
	public Iterable<Contact> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return contactRepository.findAllById(ids);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return contactRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		contactRepository.deleteById(id);
	}

	@Override
	public void delete(Contact entity) {
		// TODO Auto-generated method stub
		contactRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		contactRepository.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends Contact> entities) {
		// TODO Auto-generated method stub
		contactRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		contactRepository.deleteAll();
	}

}
