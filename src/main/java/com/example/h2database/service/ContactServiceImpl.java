package com.example.h2database.service;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.h2database.beans.Contact;
import com.example.h2database.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository repo;
	
	@Override
	public String upsert(Contact contact) {
		Contact save = repo.save(contact);
		if(contact.getCid()==0) {
			return "Saved";
		}
		return "Updated";
	}

	@Override
	public List<Contact> getAllContacts() {
		return repo.findAll();
	}

	@Override
	public Contact getContact(int cid) {		
		Optional<Contact> findById = repo.findById(cid);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public String deleteContact(int cid) {
			repo.deleteById(cid);
		return "success";
	}

}
