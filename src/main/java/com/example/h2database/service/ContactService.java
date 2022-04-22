package com.example.h2database.service;

import java.util.List;

import com.example.h2database.beans.Contact;


public interface ContactService {
	String upsert(Contact contact);
	List<Contact> getAllContacts();
	Contact getContact(int cid);
	String deleteContact(int cid);
}
