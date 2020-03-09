package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.Person;
import com.example.service.PersonService;

@RestController
@RequestMapping("/")
public class PersonController {

	@Autowired
	private PersonService service;
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/person/{name}")
	public Person getPersonByName(@PathVariable String name) {
		//Person person = restTemplate.getForObject("/http://localhost:9001/person/{name}" + Person.class);
		
		System.out.println("get person by name");
		return  new Person(1,name,29);
		//return service.getPersonByName(name);
	}
	
	@PostMapping("/person/addperson")
	public void addPerson(@RequestBody Person person) {
			service.addPerson(person); 
	}
}
