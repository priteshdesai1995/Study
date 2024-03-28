package com.example.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.contact.model.Contact;
import com.example.contact.persistance.ContactServiceImpl;

@RestController
@RequestMapping(path = "/contact")
public class ContactController {

	@Autowired
	ContactServiceImpl contactServiceImpl;

	@GetMapping(path = "/{contactId}")
	public Contact getContacts(@PathVariable("contactId") Long contactId) {
		System.out.println("Contact Id is : " + contactId);
		return contactServiceImpl.findById(contactId).orElse(null);
	}

	@PostMapping(path = "/addContact", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Contact addContacts(@RequestBody Contact contacts) {
		System.out.println("Add Contact API Called" + contacts.toString());
		return contactServiceImpl.save(contacts);
	}

	@DeleteMapping(path = "/deleteContact/{contactId}")
	public String deleteContacts(@PathVariable("contactId") Long contactId) {
		Contact contact = contactServiceImpl.findById(contactId).orElse(null);
		contactServiceImpl.deleteById(contactId);
		return "Contact Deleted with id : " + contact.getContactId();
	}

	@PutMapping(path = "/updateContact/{contactId}")
	public Contact deleteContacts(@PathVariable("contactId") Long contactId, @RequestBody Contact contact) {
//		Contact contact = contactServiceImpl.findById(contactId).orElse(null);
		return contactServiceImpl.save(contact);
	}
}
