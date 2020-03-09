package com.example.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Person;

@Repository
public interface PersonRepo extends CrudRepository<Person,String>{
	 Person findByName(String name);
}
