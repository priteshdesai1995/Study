package com.example.contact.database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.contact.model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {

}
