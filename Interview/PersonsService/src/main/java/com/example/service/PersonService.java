package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repo.PersonRepo;
import com.example.model.Person;

@Service
public class PersonService {

	@Autowired
	private PersonRepo repo;
	
	public Person getPersonByName(String name) {
		return repo.findByName(name);
	}

	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		repo.save(person);
		
	}
}
