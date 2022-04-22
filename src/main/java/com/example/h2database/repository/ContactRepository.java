package com.example.h2database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.h2database.beans.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
