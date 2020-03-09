package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int personId;
	private String name;
	private int age;
	
	public Person() {

	} 
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	} 
	
	public Person(int personId, String name, int age) {
		super();
		this.personId = personId;
		this.name = name;
		this.age = age;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", age=" + age + "]";
	} 
	
	
}
